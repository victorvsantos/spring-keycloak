package com.shankosoft.spring.keycloak.client.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringKeycloakClientApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKeycloakClientApiApplication.class, args);
    }

}
