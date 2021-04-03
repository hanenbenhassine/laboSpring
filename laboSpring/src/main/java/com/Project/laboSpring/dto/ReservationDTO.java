package com.Project.laboSpring.dto;

import com.Project.laboSpring.entities.Chambre;
import com.Project.laboSpring.entities.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationDTO {
    Integer id;


    Integer nbrPersonnes;


    LocalDateTime dateArrive;

    LocalDateTime dateDepart;

    User user;

    Chambre chambre;
}
