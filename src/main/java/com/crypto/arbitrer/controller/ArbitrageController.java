package com.crypto.arbitrer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.arbitrer.dto.Arbitrage;
import com.crypto.arbitrer.service.ArbitrerService;

@RestController
public class ArbitrageController {
	
		@Autowired
		private ArbitrerService arbitrerService;
		
		@GetMapping("/arbitrages")		
		public List<Arbitrage> arbitrage() {
			return arbitrerService.getArbitrages();	
		}
		
		@GetMapping(
				value  ="/arbitrages",
				params = "percentageSpread")		
		public List<Arbitrage> getPercentageSpread(@RequestParam ("percentageSpread") Double percentageSpread) {
			
			return arbitrerService.getPercentageSpread(percentageSpread);	
		}
	

}
