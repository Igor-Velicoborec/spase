package com.spase.spase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com"})
//@EntityScan("com.spase.spase.entity")
//@EnableJpaRepositories("com.spase.spase.repository")
public class SpaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaseApplication.class, args);
    }

}
