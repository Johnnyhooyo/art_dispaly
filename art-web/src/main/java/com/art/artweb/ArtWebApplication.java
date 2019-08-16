package com.art.artweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.Semaphore;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.art")
public class ArtWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtWebApplication.class, args);
    }

}
