package com.hirusha.Product_Service.Repository;

import com.hirusha.Product_Service.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
