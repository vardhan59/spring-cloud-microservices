package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix // for fall back alarms
@EnableHystrixDashboard
public class SpringcloudTollusageHystrixClientmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTollusageHystrixClientmsApplication.class, args);
	}
}
