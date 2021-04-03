package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.SmallChambreDTO;
import com.Project.laboSpring.entities.Chambre;
import org.springframework.stereotype.Component;

@Component
public class SmallChamabreMapper {
    public SmallChambreDTO toDTO(Chambre entity){
        if(entity==null)return null;
        return SmallChambreDTO.builder()
                .id(entity.getId())
                .adresse(entity.getAdresse())
                .places(entity.getPlaces())
                .ville(entity.getVille())
                .build();
    }
}
