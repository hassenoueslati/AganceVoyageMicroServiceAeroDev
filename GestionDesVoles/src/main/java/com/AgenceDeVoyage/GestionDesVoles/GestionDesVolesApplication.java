package com.AgenceDeVoyage.GestionDesVoles;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.AgenceDeVoyage.GestionDesVoles.entity.Avion;
import com.AgenceDeVoyage.GestionDesVoles.repository.AvionRepository;

@EnableEurekaServer
@SpringBootApplication
public class GestionDesVolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesVolesApplication.class, args);
	}
	@Bean
	ApplicationRunner init (AvionRepository repository) { return args -> {

		Stream.of("Mariem", "Sarra", "Mohamed").forEach (nomAvion -> { repository.save(new Avion (nomAvion));

			});

		repository.findAll().forEach (System.out::println);
	};

	}
}
