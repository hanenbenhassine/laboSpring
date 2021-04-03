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
public class Activites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "activites_id")
    Integer id;
    @Column(name = "activites_name")
    String nom;
    @Column(name = "activites_description")
    String description;
    @ManyToMany
    @JoinTable(
            name = "chambre_activites",
            joinColumns = @JoinColumn(name = "chambre_id"),
            inverseJoinColumns = @JoinColumn(name = "activities_id"))
    List<Chambre> chambreList;

}
