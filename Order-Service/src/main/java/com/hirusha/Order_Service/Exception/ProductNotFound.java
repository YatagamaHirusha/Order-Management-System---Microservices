package com.hirusha.Order_Service.Exception;

public class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message) {
        super(message);
    }
    public ProductNotFound(){
        super("Product not found.");
    }
}
