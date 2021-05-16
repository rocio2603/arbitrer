package com.crypto.arbitrer.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crypto.arbitrer.constants.Symbol;
import com.crypto.arbitrer.dto.Arbitrage;
import com.crypto.arbitrer.dto.DtoConverter;
import com.crypto.arbitrer.dto.MarketPriceDto;
import com.crypto.arbitrer.service.ArbitrerService;
import com.crypto.arbitrer.ticker.PriceBinance;
import com.crypto.arbitrer.ticker.PriceBittrex;
import com.crypto.arbitrer.ticker.coinbase.PriceCoinbase;
import com.crypto.arbitrer.ticker.kraken.PriceKraken;
import com.crypto.arbitrer.ticker.poloniex.PricePoloniex;

@Service("arbitrerService")
public class ArbitrerServiceImpl implements ArbitrerService {

	@Override
	public List<MarketPriceDto> getPrices(String symbol) {
		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<PriceBinance> res = null;
		ResponseEntity<PriceCoinbase> res2 = null;
		ResponseEntity<PriceBittrex> res3 = null;
		ArrayList <MarketPriceDto> priceList = new ArrayList <MarketPriceDto> ();
				
		res =restTemplate.getForEntity("https://api.binance.com/api/v3/ticker/price?symbol=BTCUSDT", PriceBinance.class);
		MarketPriceDto binance = DtoConverter.toDto(res.getBody());		
		priceList.add(binance);
		
		HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "ReadMe-API-Explorer");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        String bitfinexUrl = "https://api-pub.bitfinex.com/v2/tickers?symbols=tBTCUSD";
        ResponseEntity<List> bitfinexResponse = restTemplate.exchange(bitfinexUrl, HttpMethod.GET, entity, List.class);
        MarketPriceDto bitfinex = DtoConverter.toDto(bitfinexResponse.getBody());	
		priceList.add(bitfinex);
			
		res2 =restTemplate.getForEntity("https://api.coinbase.com/v2/prices/BTC-USD/buy", PriceCoinbase.class);
		MarketPriceDto coinbase = DtoConverter.toDto(res2.getBody());	
		priceList.add(coinbase);
						
		res3=restTemplate.getForEntity("https://api.bittrex.com/v3/markets/BTC-USDT/ticker", PriceBittrex.class);
		MarketPriceDto bittrex = DtoConverter.toDto(res3.getBody());	
		priceList.add(bittrex);	
		
		ResponseEntity<PricePoloniex> pricePoloniexResponse = restTemplate.getForEntity("https://poloniex.com/public?command=returnTicker", PricePoloniex.class);
		MarketPriceDto poloniex = DtoConverter.toDto(pricePoloniexResponse.getBody());	
		priceList.add(poloniex);
		
		ResponseEntity<PriceKraken> priceKraken = restTemplate.getForEntity("https://api.kraken.com/0/public/Ticker?pair=XBTUSD", PriceKraken.class);
		MarketPriceDto kraken = DtoConverter.toDto(priceKraken.getBody());
		priceList.add(kraken);
		
		priceList.sort(Comparator.comparing(MarketPriceDto::getPrice));	
		return priceList;		
	}
	
	
	@Override
	public List<Arbitrage> getArbitrages() {
		List <MarketPriceDto> list = this.getPrices(Symbol.BTCUSDT);	
		List<Arbitrage> arbitrages = new ArrayList<>();
		for (int i=0; i<list.size(); i++ ) {	
			for ( int j=i+1; j<list.size(); j++ ) {				
				Arbitrage arbitrage = new Arbitrage();
				arbitrage.setTicker(list.get(0).getSymbol());
				arbitrage.setBuyPrice(list.get(i).getPrice());
				arbitrage.setBuyMarket(list.get(i).getMarket());
				arbitrage.setSellPrice(list.get(j).getPrice());
				arbitrage.setSellMarket(list.get(j).getMarket());
				arbitrage.setPercentageSpread((((list.get(j).getPrice()-list.get(i).getPrice())*100)/list.get(i).getPrice()));
				arbitrages.add(arbitrage);
			}
		}
		arbitrages.sort(Comparator.comparing(Arbitrage::getPercentageSpread).reversed());
		return  arbitrages;
	}
		
	@Override
	public List<Arbitrage> getPercentageSpread(Double percentageSpread){
		List<Arbitrage> spreadArbitrages = new ArrayList<>();
		List<Arbitrage> arbitrages = this.getArbitrages();
		for (int i=0; i<arbitrages.size();i++){
			if (arbitrages.get(i).getPercentageSpread()>= percentageSpread){
				spreadArbitrages.add(arbitrages.get(i));
			}				
		}			
		return spreadArbitrages;
	}
		
		
		
		

}
