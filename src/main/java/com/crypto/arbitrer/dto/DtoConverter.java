package com.crypto.arbitrer.dto;

import com.example.PriceBinance;
import com.example.PriceBittrex;
import com.example.PriceCoinbase;

public class DtoConverter {

	public static MarketPriceDto toDto(PriceBinance priceBinance) {
		
		String name = "BINANCE";
		float price= Float.parseFloat(priceBinance.getPrice());
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceBittrex priceBittrex) {
		
		String name = "BITTREX";
		float price= Float.parseFloat(priceBittrex.getLastTradeRate());
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
				
		return marketPrice;
	}
	
	public static MarketPriceDto toDto(PriceCoinbase priceCoinbase) {
		
		String name = "COINBASE";
		float price= Float.parseFloat(priceCoinbase.getData().getAmount());
				
		MarketPriceDto marketPrice = new MarketPriceDto();
		marketPrice.setMarket(name);
		marketPrice.setPrice(price);
				
		return marketPrice;
	}
	
	

}
