package com.hirusha.Product_Service.Controller;

import com.hirusha.Product_Service.DTO.ProductRequest;
import com.hirusha.Product_Service.Model.Product;
import com.hirusha.Product_Service.Repository.ProductRepo;
import com.hirusha.Product_Service.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public List<Product> getProuctsByName(@PathVariable String name){
        return productService.getProductsByName(name);
    }

    @PostMapping
    public Product addProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest);
    }

    @PutMapping
    public Product updateProduct(@RequestBody ProductRequest productRequest){
        return productService.updateProduct(productRequest);
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
