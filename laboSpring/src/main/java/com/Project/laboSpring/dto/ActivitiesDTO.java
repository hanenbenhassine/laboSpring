package com.Project.laboSpring.dto;

import com.Project.laboSpring.entities.Chambre;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivitiesDTO {
    Integer id;

    String nom;

    String description;

    List<Chambre> chambreList;
}
