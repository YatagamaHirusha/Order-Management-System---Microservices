package com.hirusha.Order_Service.Client;

import com.hirusha.Order_Service.DTO.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Product-Service", fallback = ProductClientFallback.class)
public interface ProductClient {
    @GetMapping("/api/product/id/{id}")
    ProductDTO getProductById(@PathVariable int id);
}
