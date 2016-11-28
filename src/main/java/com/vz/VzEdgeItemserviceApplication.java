package com.vz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value = "com.vz.feign")
public class VzEdgeItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VzEdgeItemserviceApplication.class, args);
	}
}
