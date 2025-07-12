package com.hirusha.Product_Service.Service;

import com.hirusha.Product_Service.DTO.ProductRequest;
import com.hirusha.Product_Service.Model.Product;
import com.hirusha.Product_Service.Repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Product addProduct(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.name());
        product.setCategory(productRequest.category());
        product.setDescription(productRequest.description());
        product.setPrice(productRequest.price());
        product.setQuantity(productRequest.quantity());
        product.setInStock(productRequest.inStock());
        product.setCountry(productRequest.country());
        return productRepo.save(product);
    }

    public void deleteProduct(){}

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public List<Product> getProductsByName(String name){
        return productRepo.getProductByName(name);
    }
}
