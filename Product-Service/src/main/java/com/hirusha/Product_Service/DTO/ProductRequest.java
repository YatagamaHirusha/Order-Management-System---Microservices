package com.hirusha.Product_Service.DTO;

import com.hirusha.Product_Service.Model.Category;

public record ProductRequest(
        String name,
        String description,
        String country,
        double price,
        int quantity,
        Category category,
        boolean inStock
) {
}
