package com.crypto.arbitrer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.arbitrer.dto.MarketPriceDto;
import com.crypto.arbitrer.service.ArbitrerService;

@RestController
public class PricesController {
	
	@Autowired
	private ArbitrerService arbitrerService;
	
	@GetMapping("/marketprices")
	public List<MarketPriceDto> getPrices(@RequestParam String symbol) {
		return arbitrerService.getPrices(symbol);	
	}	
	
}
