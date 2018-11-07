package com.example.dddjava.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan("com.example.dddjava")
@EnableJpaRepositories("com.example.dddjava")
@EntityScan("com.example.dddjava")
public class DddjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddjavaApplication.class, args);
    }
}
