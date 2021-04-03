package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.UserDTO;
import com.Project.laboSpring.entities.User;
import org.springframework.stereotype.Service;

@Service
public class GeneralMapper {
    public UserDTO toUserDTO(User entity){
        return entity!=null?
                UserDTO.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .roles(entity.getRoles())
                .email(entity.getEmail())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .build():null;
    }
    public User toUserEntity(UserDTO dto)
    {
        return dto !=null?
                User.builder()
                .id(dto.getId())
            .username(dto.getUsername())
            .password(dto.getPassword())
            .roles(dto.getRoles())
            .email(dto.getEmail())
            .firstname(dto.getFirstname())
            .lastname(dto.getLastname())
            .build():null;

    }
}
