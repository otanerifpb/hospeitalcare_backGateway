package br.edu.ifpb.pdist.hospitalgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HospitalgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalgatewayApplication.class, args);
	}

}
