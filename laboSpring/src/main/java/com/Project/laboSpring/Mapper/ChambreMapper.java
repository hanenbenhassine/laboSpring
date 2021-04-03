package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.ChambreDTO;
import com.Project.laboSpring.entities.Chambre;
import com.Project.laboSpring.entities.User;
import org.springframework.stereotype.Component;

@Component
public class ChambreMapper implements Mapper<ChambreDTO, Chambre>{
    private final SmallChamabreMapper smallChamabreMapper;
    private fi
    @Override
    public ChambreDTO toDTO(Chambre chambre) {
        if(chambre==null)return null;
        return ChambreDTO.builder()
                .id(chambre.getId())
                .adresse(chambre.getAdresse())
                .places(chambre.getPlaces())
                .ville(chambre.getVille())
                .user(chambre.getUser())
                .activitesList(chambre.getActivitesList()==null?null:chambre.getActivitesList().stream().map())
                .build();
    }

    @Override
    public Chambre toEntity(ChambreDTO entity) {
        return null;
    }
}
