package com.crypto.arbitrer.dto;

import com.crypto.arbitrer.constants.Symbol;
import com.example.PriceBinance;
import com.example.PriceBittrex;
import com.example.PriceCoinbase;

public class DtoConverter {

	public static MarketPriceDto toDto(PriceBinance priceBinance) {
		
		String name = "BINANCE";
		Double price= priceBinance.getPrice();
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceBittrex priceBittrex) {
		
		String name = "BITTREX";
		Double price= priceBittrex.getLastTradeRate();
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceCoinbase priceCoinbase) {
		
		String name = "COINBASE";
		Double price= priceCoinbase.getData().getAmount();
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
		marketPrice.setSymbol(Symbol.BTCUSDT);
				
		return marketPrice;
	}
	
	

}
