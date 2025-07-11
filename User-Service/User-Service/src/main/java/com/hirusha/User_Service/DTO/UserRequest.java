package com.hirusha.User_Service.DTO;

import com.hirusha.User_Service.Model.Role;

public record UserRequest(String nic, String username, String password, String email, Role role) {
}
