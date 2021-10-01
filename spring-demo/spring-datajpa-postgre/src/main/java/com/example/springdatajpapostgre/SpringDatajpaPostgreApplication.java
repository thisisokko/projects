package com.example.springdatajpapostgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDatajpaPostgreApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDatajpaPostgreApplication.class, args);
  }

}
