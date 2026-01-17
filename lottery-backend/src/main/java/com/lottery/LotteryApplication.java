package com.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Lottery Backend Application
 * 
 * @author Lottery Team
 */
@SpringBootApplication
public class LotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
        System.out.println("Lottery Backend Service Started Successfully!");
    }
}
