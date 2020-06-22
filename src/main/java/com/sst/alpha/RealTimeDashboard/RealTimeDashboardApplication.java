package com.sst.alpha.RealTimeDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.sst.alpha")
public class RealTimeDashboardApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RealTimeDashboardApplication.class, args);
		
	}
}
