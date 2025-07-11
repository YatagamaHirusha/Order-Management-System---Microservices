package com.hirusha.User_Service.Repository;

import com.hirusha.User_Service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    void deleteUserByUsername(String username);

    void deleteUserByNic(String nic);

    User getUserByNic(String nic);
}
