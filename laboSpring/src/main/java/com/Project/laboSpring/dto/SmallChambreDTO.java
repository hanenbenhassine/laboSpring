package com.Project.laboSpring.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmallChambreDTO {
    Integer id;

    String adresse;

    String ville;

    String places;
}
