package com.estsoft.pilotauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PilotAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PilotAuthApplication.class, args);

        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.printf("bar : %s\n", passwordEncoder.encode("bar"));
        System.out.printf("pass : %s\n", passwordEncoder.encode("pass"));
    }
}
