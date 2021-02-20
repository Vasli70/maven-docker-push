package com.srini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenDockerPushApplication {

	@GetMapping("/message")
	public String getMapping(){
		return ("Message from Main method");
	}

	public static void main(String[] args) {
		SpringApplication.run(MavenDockerPushApplication.class, args);
	}

}
