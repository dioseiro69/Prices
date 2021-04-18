package com.amaris.config;

import org.springframework.batch.item.ItemProcessor;

import com.amaris.model.Prices;

public class H2LogProcessor implements ItemProcessor<Prices, Prices> {
	

	@Override
	public Prices process(Prices prices) throws Exception {
		 System.out.println("Inserting prices : " + prices);
	        return prices;
	}

}
