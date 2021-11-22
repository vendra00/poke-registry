package com.pokemonpedia.pokeserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PokeServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeServiceRegistryApplication.class, args);
	}

}
