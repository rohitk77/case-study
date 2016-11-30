package com.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com.vendor")
@EnableCaching
@EnableEurekaClient
public class OnlineVendorServiceSpringBoot {
	
	public static void main(String[] args)
	{
		new SpringApplication(OnlineVendorServiceSpringBoot.class).run(args);
	}

}
