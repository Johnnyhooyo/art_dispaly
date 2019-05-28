package com.art.artweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.art")
public class ArtWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtWebApplication.class, args);
    }

}
