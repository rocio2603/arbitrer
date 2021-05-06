package com.crypto.arbitrer.dto;

public class MarketPriceDto {
	
	private String symbol=null;
	private Double price= null;
	private String market=null;
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol= symbol;
	}
	
	

}
