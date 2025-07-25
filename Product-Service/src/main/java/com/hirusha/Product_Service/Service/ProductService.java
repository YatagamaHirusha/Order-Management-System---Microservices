package com.hirusha.Product_Service.Service;

import com.hirusha.Product_Service.DTO.ProductRequest;
import com.hirusha.Product_Service.Exception.ProductNotFound;
import com.hirusha.Product_Service.Model.Product;
import com.hirusha.Product_Service.Repository.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
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

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public List<Product> getProductsByName(String name){
        return productRepo.getProductByName(name);
    }

    public Product getProductById(int id){
        return productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found."));
    }

    public Product updateProduct(ProductRequest productRequest){
        Product existingProduct = productRepo.findById(productRequest.id()).orElseThrow(ProductNotFound::new);
        if(productRequest.name() != null){
            existingProduct.setName(productRequest.name());
        }
        if(productRequest.category() != null){
            existingProduct.setCategory(productRequest.category());
        }
        if(productRequest.inStock() != null){
            existingProduct.setInStock(productRequest.inStock());
        }
        if(productRequest.price() != null){
            existingProduct.setPrice(productRequest.price());
        }
        if(productRequest.description() != null){
            existingProduct.setDescription(productRequest.description());
        }
        if(productRequest.quantity() != null){
            existingProduct.setQuantity(productRequest.quantity());
        }
        if(productRequest.country() != null){
            existingProduct.setCountry(productRequest.country());
        }
        return productRepo.save(existingProduct);
    }

}
