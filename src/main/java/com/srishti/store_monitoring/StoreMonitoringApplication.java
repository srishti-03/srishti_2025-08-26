package com.srishti.store_monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class StoreMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreMonitoringApplication.class, args);
	}

}
