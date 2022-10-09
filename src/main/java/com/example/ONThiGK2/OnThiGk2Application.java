package com.example.ONThiGK2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages= "com.*")
@Configuration
@ComponentScan("com.example.ONThiGK2")
public class OnThiGk2Application {

	public static void main(String[] args) {
		SpringApplication.run(OnThiGk2Application.class, args);
	}

}
