package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.SmallActivitiesDTO;
import com.Project.laboSpring.entities.Activites;
import org.springframework.stereotype.Component;

@Component
public class SmallActivitesMapper {
    public SmallActivitiesDTO toDTO(Activites entity){
        if(entity==null)return null;
        return SmallActivitiesDTO.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .description(entity.getDescription())
                .build();
    }
}
