package com.withIsmlCode.clientes_api.entity;

import jakarta.persistence.*;
import  lombok.Data;
@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String phone;
}
