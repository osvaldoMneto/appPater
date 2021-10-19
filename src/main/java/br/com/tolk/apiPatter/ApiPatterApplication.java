package br.com.tolk.apiPatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiPatterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPatterApplication.class, args);
	}

}
