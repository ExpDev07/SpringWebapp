package com.github.expdev07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Main application class
 */
@SpringBootApplication
@EnableJpaAuditing
public class RaycastApplication {

    /**
     * Program entry method
     *
     * @param args Additional arguments
     */
    public static void main(String[] args) {
        // Run spring!
        SpringApplication.run(RaycastApplication.class, args);
    }

}
