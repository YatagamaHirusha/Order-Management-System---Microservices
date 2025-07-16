package com.hirusha.Order_Service.Client;

import com.hirusha.Order_Service.DTO.UserDTO;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "User-Service", fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/api/user/{id}")
    UserDTO getUserById(@PathVariable int id);
}
