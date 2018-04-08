package com.example.sportgameservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.stream.Stream;

@EnableEurekaClient
@SpringBootApplication
public class SportGameServiceApplication {



	@Bean
	CommandLineRunner commandLineRunner(SportGameRepository sportGameRepository) {
		SportGame sportGame1 = new SportGame("Morocco", "Serbia");
		SportGame sportGame2 = new SportGame("France", "Colombia");
		return games-> Stream.of(sportGame1,sportGame2).forEach(sportGame -> sportGameRepository.save(sportGame));
	}

	public static void main(String[] args) {
		SpringApplication.run(SportGameServiceApplication.class, args);
	}


}



