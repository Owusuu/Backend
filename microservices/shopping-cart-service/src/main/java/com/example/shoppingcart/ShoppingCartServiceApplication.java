package com.example.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShoppingCartServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartServiceApplication.class, args);
    }
} 