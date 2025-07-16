package com.hirusha.Order_Service.Client;

import com.hirusha.Order_Service.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient{

    @Override
    public UserDTO getUserById(int id){
        System.out.println("User service is down.. Returning dummy user.");
        return new UserDTO(0);
    }
}
