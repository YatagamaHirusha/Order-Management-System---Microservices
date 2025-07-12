package com.hirusha.Product_Service.Model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double price;
    private int quantity;
    private boolean inStock;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String country;
}
