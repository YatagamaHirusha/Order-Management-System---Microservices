package com.hirusha.User_Service.DTO;

import com.hirusha.User_Service.Model.Role;

public record UpdateUserRequest(
        String currentNic,
        String newNic,
        String username,
        String password,
        String email,
        Role role
) {
}
