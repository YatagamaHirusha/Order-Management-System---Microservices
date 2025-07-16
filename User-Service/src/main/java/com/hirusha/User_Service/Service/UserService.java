package com.hirusha.User_Service.Service;

import com.hirusha.User_Service.DTO.NewUserRequest;
import com.hirusha.User_Service.DTO.UpdateUserRequest;
import com.hirusha.User_Service.Model.User;
import com.hirusha.User_Service.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User registerUser(NewUserRequest newUserRequest){
        User user = new User();
        user.setEmail(newUserRequest.email());
        user.setRole(newUserRequest.role());
        user.setUsername(newUserRequest.username());
        user.setPassword((newUserRequest.password()));
        user.setNic(newUserRequest.nic());
        return userRepo.save(user);
    }

    public void deleteUser(String nic){
        userRepo.deleteUserByNic(nic);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(int id){
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser( UpdateUserRequest updateUserRequest){
        User user = userRepo.getUserByNic(updateUserRequest.currentNic()).orElseThrow(() -> new RuntimeException("User not found")) ;
        if(updateUserRequest.newNic() != null){
            user.setNic(updateUserRequest.newNic());
        }
        if(updateUserRequest.role() != null){
            user.setRole(updateUserRequest.role());
        }
        if(updateUserRequest.username() != null){
            user.setUsername(updateUserRequest.username());
        }
        if(updateUserRequest.email() != null){
            user.setEmail(updateUserRequest.email());
        }
        return userRepo.save(user);
    }
}
