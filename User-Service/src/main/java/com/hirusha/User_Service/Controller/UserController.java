package com.hirusha.User_Service.Controller;

import com.hirusha.User_Service.DTO.NewUserRequest;
import com.hirusha.User_Service.DTO.UpdateUserRequest;
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
    public User register(@RequestBody NewUserRequest newUserRequest){
        return userService.registerUser(newUserRequest);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{nic}")
    public void deleteUser(@PathVariable String nic){
        userService.deleteUser(nic);
    }

    @PutMapping()
    public User updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return userService.updateUser(updateUserRequest);
    }

}
