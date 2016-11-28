package com.vz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.vz.entities.Item;

import feign.Headers;
import feign.RequestLine;

@FeignClient(name = "vz-microservice-item")
public interface MicroServiceClientA {
	
	@Headers(HttpHeaders.CONTENT_TYPE + ":" + MediaType.APPLICATION_JSON_VALUE)
	@RequestLine("GET /item/")
	Item getItemMetadata();
	
}