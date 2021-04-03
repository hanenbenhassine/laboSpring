package com.Project.laboSpring.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmallResrvationDTO {
    Integer id;


    Integer nbrPersonnes;


    LocalDateTime dateArrive;

    LocalDateTime dateDepart;
}
