package com.example.backend.dto;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
public class OrderDto {


    private String name;
    private String address;
    private String payment;
    private String cardNumber;
    private String items;

}
