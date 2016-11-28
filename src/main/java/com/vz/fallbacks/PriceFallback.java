package com.vz.fallbacks;

import org.springframework.stereotype.Component;

import com.vz.entities.Price;
import com.vz.feign.MicroServiceClientB;

@Component
public class PriceFallback implements MicroServiceClientB{

	@Override
	public Price getItemPrice() {
		// TODO Auto-generated method stub
		return new Price(0.0,0.0,0.0);
		
	}

}
