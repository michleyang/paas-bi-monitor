package com.rkhd.ienterprise.paas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PaasBiMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaasBiMonitorApplication.class, args);
	}
}
