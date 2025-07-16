package com.hirusha.Order_Service.Client;

import com.hirusha.Order_Service.DTO.ProductDTO;
import com.hirusha.Order_Service.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient{
    @Override
    public ProductDTO getProductById(int id){
        System.out.println("Product service is down.. Returning dummy product.");
        return new ProductDTO(0);
    }
}
