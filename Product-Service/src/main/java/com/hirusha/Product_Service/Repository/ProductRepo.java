package com.hirusha.Product_Service.Repository;

import com.hirusha.Product_Service.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> getProductByName(String name);
}
