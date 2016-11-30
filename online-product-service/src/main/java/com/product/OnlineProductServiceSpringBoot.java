package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages="com.product")
@EnableCaching
@EnableDiscoveryClient
public class OnlineProductServiceSpringBoot {
	
	public static void main(String[] args)
	{
		new SpringApplication(OnlineProductServiceSpringBoot.class).run(args);
	}

}
