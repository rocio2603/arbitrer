package com.crypto.arbitrer.dto;

import java.util.Date;
import java.util.List;

import com.crypto.arbitrer.constants.Symbol;
import com.crypto.arbitrer.ticker.PriceBinance;
import com.crypto.arbitrer.ticker.PriceBittrex;
import com.crypto.arbitrer.ticker.coinbase.PriceCoinbase;
import com.crypto.arbitrer.ticker.kraken.PriceKraken;
import com.crypto.arbitrer.ticker.poloniex.PricePoloniex;

public class DtoConverter {

	public static MarketPriceDto toDto(PriceBinance priceBinance) {
		String name = "BINANCE";
		Double price= priceBinance.getPrice();
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
		marketPrice.setDate(new Date());
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceBittrex priceBittrex) {
		String name = "BITTREX";
		Double price= priceBittrex.getLastTradeRate();
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
		marketPrice.setDate(new Date());				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceCoinbase priceCoinbase) {
		String name = "COINBASE";
		Double price= priceCoinbase.getData().getAmount();
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
		marketPrice.setDate(new Date());				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(List priceBitfinex) {
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket("BITFINEX");
		String price = String.valueOf(((List)priceBitfinex.get(0)).get(7));
        marketPrice.setPrice(Double.valueOf(price));
        marketPrice.setSymbol(Symbol.BTCUSDT);
        marketPrice.setDate(new Date());
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PricePoloniex pricePoloniex) {
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket("POLONIEX");
		Double price = Double.valueOf(pricePoloniex.getUsdtBtc().getLast());
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
		marketPrice.setDate(new Date());
		return marketPrice;
	}

	public static MarketPriceDto toDto(PriceKraken priceKraken) {
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket("KRAKEN");
		Double price = Double.valueOf(priceKraken.getResult().getXxbtzusd().getC().get(0));
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
		marketPrice.setDate(new Date());
		return marketPrice;
	}
	

}
