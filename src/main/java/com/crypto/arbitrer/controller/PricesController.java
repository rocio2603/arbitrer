package com.crypto.arbitrer.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crypto.arbitrer.dto.DtoConverter;
import com.crypto.arbitrer.dto.MarketPriceDto;
import com.example.PriceBinance;
import com.example.PriceBittrex;
import com.example.PriceCoinbase;



@RestController
public class PricesController {
		
	@GetMapping("/marketpricesBTC")
	public List<MarketPriceDto> getPrice() {
		
		RestTemplate prueba= new RestTemplate();
		
		ResponseEntity<PriceBinance> res = null;
		ResponseEntity<PriceCoinbase> res2 = null;
		ResponseEntity<PriceBittrex> res3 = null;
		
		ArrayList <MarketPriceDto> priceList = new ArrayList <MarketPriceDto> ();
				
		res =prueba.getForEntity("https://api.binance.com/api/v3/ticker/price?symbol=BTCUSDT", PriceBinance.class);
		MarketPriceDto binance = DtoConverter.toDto(res.getBody());		
		priceList.add(binance);
		
		//RestTemplate rt = new RestTemplate();
		//HttpHeaders headers = new HttpHeaders();
        //headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        //headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        //HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        //String url1 = "https://jsonplaceholder.typicode.com/posts/1";
        //ResponseEntity<String> res1 = rt.exchange(url1, HttpMethod.GET, entity, String.class);
			
		res2 =prueba.getForEntity("https://api.coinbase.com/v2/prices/BTC-USD/buy", PriceCoinbase.class);
		MarketPriceDto coinbase = DtoConverter.toDto(res2.getBody());	
		priceList.add(coinbase);
						
		res3=prueba.getForEntity("https://api.bittrex.com/v3/markets/BTC-USDT/ticker", PriceBittrex.class);
		MarketPriceDto bittrex = DtoConverter.toDto(res3.getBody());	
		priceList.add(bittrex);	
				
		priceList.sort(Comparator.comparing(MarketPriceDto::getPrice));
				
			
		return priceList;
		
	}
	
}
