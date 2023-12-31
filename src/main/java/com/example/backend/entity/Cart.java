package com.example.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="carts")
@Entity
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동증가
    private int id;

    @Column
    private int memberId;

    @Column
    private int itemId;


    
}
