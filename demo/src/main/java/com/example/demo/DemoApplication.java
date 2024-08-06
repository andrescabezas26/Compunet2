package com.example.demo;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class DemoApplication implements CommandLineRunner {

	private static final Logger log = Logger.getLogger(DemoApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello Spring Boot");
	}

}
