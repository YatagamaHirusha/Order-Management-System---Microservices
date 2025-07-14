package com.hirusha.Product_Service.DTO;

import com.hirusha.Product_Service.Model.Category;

public record ProductRequest(
        int id,
        String name,
        String description,
        String country,
        Double price,
        Integer quantity,
        Category category,
        Boolean inStock
) {
}
