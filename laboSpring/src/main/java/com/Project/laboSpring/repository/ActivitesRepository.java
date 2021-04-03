package com.Project.laboSpring.repository;

import com.Project.laboSpring.dto.ActivitiesDTO;
import com.Project.laboSpring.entities.Activites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivitesRepository extends JpaRepository<ActivitiesDTO, Activites> {
}
