package com.Project.laboSpring.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserDTO {
    Integer id;

    String username;
    String password;
    String firstname;
    String lastname;
    String email;

    List<String> roles;

}
