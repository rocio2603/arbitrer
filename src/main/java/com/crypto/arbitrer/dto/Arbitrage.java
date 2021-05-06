package com.crypto.arbitrer.dto;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arbitrage {
	
//{ticker: "btcusdt", buyMarket: "binance", buyPrice: "55,000". sellMarket: "bitfinex", sellPrice: "56,000", win: "10%"},
//market price solo tiene precio y market
	
	String ticker=null;
	String buyMarket=null;
	Double buyPrice=null;
	String sellMarket=null;
	Double sellPrice=null;
	Double percentageSpread = null;
	
	
	
		public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getBuyMarket() {
		return buyMarket;
	}

	public void setBuyMarket(String buyMarket) {
		this.buyMarket = buyMarket;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getSellMarket() {
		return sellMarket;
	}

	public void setSellMarket(String sellMarket) {
		this.sellMarket = sellMarket;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Double getPercentageSpread() {
		return percentageSpread;
	}

	public void setPercentageSpread(Double percentageSpread) {
		this.percentageSpread = percentageSpread;
	}
	
}