package com.responsible_nrg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class Lab3CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3CloudConfigServerApplication.class, args);
	}
}