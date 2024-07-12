package io.linkfast.openapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Openapi2Application {

	public static void main(String[] args) {
		SpringApplication.run(Openapi2Application.class, args);
	}

}
