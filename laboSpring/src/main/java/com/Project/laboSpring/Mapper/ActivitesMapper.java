package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.ActivitiesDTO;
import com.Project.laboSpring.entities.Activites;

public class ActivitesMapper implements Mapper<ActivitiesDTO, Activites>{
    private final
    @Override
    public ActivitiesDTO toDTO(Activites activites) {
        if(activites==null)return null;
        return ActivitiesDTO
                .builder()
                .id(activites.getId())
                .nom(activites.getNom())
                .description(activites.getDescription())
                .chambreList(activites.getChambreList()==null:activites.getChambreList().stream().map())
                .build();²
    }

    @Override
    public Activites toEntity(ActivitiesDTO entity) {
        return null;
    }
}
