package com.crypto.arbitrer.service;

import java.util.List;

import com.crypto.arbitrer.dto.Arbitrage;
import com.crypto.arbitrer.dto.MarketPriceDto;

public interface ArbitrerService {

	List<MarketPriceDto> getPrices(String symbol);
	
	List<Arbitrage> getArbitrages();

	List<Arbitrage> getPercentageSpread(Double percentageSpread);		

}
