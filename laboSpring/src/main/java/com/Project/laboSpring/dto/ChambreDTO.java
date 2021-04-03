package com.Project.laboSpring.dto;

import com.Project.laboSpring.entities.Activites;
import com.Project.laboSpring.entities.Reservation;
import com.Project.laboSpring.entities.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChambreDTO {
    Integer id;

    String adresse;

    String ville;

    String places;

    User user;

    List<Reservation> reservationList;

    List<Activites>activitesList;
}
