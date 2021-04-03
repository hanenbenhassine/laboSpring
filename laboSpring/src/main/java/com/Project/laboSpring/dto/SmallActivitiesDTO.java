package com.Project.laboSpring.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmallActivitiesDTO {
    Integer id;

    String nom;

    String description;
}
