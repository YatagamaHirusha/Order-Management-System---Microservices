package com.hirusha.Product_Service.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private Boolean inStock;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String country;
}
