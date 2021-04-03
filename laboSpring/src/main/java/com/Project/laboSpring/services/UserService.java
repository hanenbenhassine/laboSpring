package com.Project.laboSpring.services;

import com.Project.laboSpring.dto.UserDTO;
import com.Project.laboSpring.entities.User;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();
    boolean insert(User u);
}
