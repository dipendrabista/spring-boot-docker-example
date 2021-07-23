package com.punojsoft.sbbootdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbBootDockerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbBootDockerExampleApplication.class, args);
    }

    @GetMapping(value = "/")
    public String index() {
        return "Spring boot docker example!";
    }
}
