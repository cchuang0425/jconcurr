package com.github.jconcurr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JConcurrServerApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(JConcurrServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JConcurrServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("hi!");
    }
}
