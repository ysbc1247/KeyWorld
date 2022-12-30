package com.keyworld.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class KeyWorldProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyWorldProjectBoardApplication.class, args);
    }

}
