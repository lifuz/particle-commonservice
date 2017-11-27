package com.lifuz.particlecommon.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ParticleCommonEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParticleCommonEurekaApplication.class, args);
	}
}
