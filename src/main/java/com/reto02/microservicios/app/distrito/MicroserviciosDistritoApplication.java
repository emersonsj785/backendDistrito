package com.reto02.microservicios.app.distrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.reto02.commons.entidad.models.entity",
			"com.reto02.microservicios.app.distrito.models.entity"})
public class MicroserviciosDistritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosDistritoApplication.class, args);
	}

}
