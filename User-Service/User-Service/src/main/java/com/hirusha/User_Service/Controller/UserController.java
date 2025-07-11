package com.hirusha.User_Service.Controller;

import com.hirusha.User_Service.DTO.UserRequest;
import com.hirusha.User_Service.Model.User;
import com.hirusha.User_Service.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody UserRequest userRequest){
        return userService.registerUser(userRequest);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping
    public void deleteUser(@PathVariable String nic){
        userService.deleteUser(nic);
    }

}
