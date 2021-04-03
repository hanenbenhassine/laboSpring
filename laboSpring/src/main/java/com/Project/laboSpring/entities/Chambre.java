package com.Project.laboSpring.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
@Entity

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chambre_id")
    Integer id;
    @Column(name = "user_adresse")
    String adresse;
    @Column(name = "user_ville")
    String ville;
    @Column(name = "user_places")
    String places;
    @ManyToOne
    @JoinColumn(name="user_id")
    User user;
    @OneToMany(mappedBy = "chambre")
    List<Reservation>reservationList;
    @ManyToMany

    List<Activites>activitesList;
}

