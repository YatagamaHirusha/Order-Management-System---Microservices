package com.hirusha.User_Service.DTO;

import com.hirusha.User_Service.Model.Role;

public record NewUserRequest(String nic, String username, String password, Role role, String email) {
}
