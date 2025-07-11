package com.hirusha.User_Service.Service;

import com.hirusha.User_Service.DTO.UserRequest;
import com.hirusha.User_Service.Model.User;
import com.hirusha.User_Service.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User registerUser(UserRequest userRequest){
        User user = new User();
        user.setEmail(userRequest.email());
        user.setRole(userRequest.role());
        user.setUsername(userRequest.username());
        user.setPassword((userRequest.password()));
        return userRepo.save(user);
    }

    public void deleteUser(String nic){
        userRepo.deleteUserByNic(nic);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(UserRequest userRequest){
        User user = userRepo.getUserByNic(userRequest.nic());
        if(user != null){
            throw new RuntimeException("User not found.");
        }
        else{
            user.setId();
            return userRepo.save(user);
        }

    }
}
