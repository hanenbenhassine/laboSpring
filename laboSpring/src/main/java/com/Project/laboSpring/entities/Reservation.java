package com.Project.laboSpring.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    @Column(name = "reservation_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "reservation_nbrPersonnes")

    Integer nbrPersonnes;
    @Column(name = "reservation_dateArrive")

    LocalDateTime dateArrive;
    @Column(name = "reservation_dateDepart")
    LocalDateTime dateDepart;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @ManyToOne
    @JoinColumn(name = "chambre_id")
    Chambre chambre;
}
