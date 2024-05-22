package ch.bbw.warenkorbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WarenkorbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarenkorbServiceApplication.class, args);
	}

}
