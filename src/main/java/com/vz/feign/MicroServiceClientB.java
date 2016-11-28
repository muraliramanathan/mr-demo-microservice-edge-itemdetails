package com.vz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.vz.entities.Price;
import com.vz.fallbacks.PriceFallback;

import feign.Headers;
import feign.RequestLine;

@FeignClient(name = "vz-microservice-price", fallback=PriceFallback.class) 
public interface MicroServiceClientB {
	
	@Headers(HttpHeaders.CONTENT_TYPE + ":" + MediaType.APPLICATION_JSON_VALUE)
	@RequestLine("GET /price/")
	Price getItemPrice();
	
}

