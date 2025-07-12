package com.hirusha.Product_Service.Service;

import com.hirusha.Product_Service.DTO.ProductRequest;
import com.hirusha.Product_Service.Model.Product;
import com.hirusha.Product_Service.Repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Product addProduct(ProductRequest productRequest){
        Product existingProduct = 
    }
}
