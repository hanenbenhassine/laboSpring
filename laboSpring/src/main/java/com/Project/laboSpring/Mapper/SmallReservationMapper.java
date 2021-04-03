package com.Project.laboSpring.Mapper;

import com.Project.laboSpring.dto.ReservationDTO;
import com.Project.laboSpring.dto.SmallResrvationDTO;
import com.Project.laboSpring.entities.Reservation;
import org.springframework.stereotype.Component;

@Component
public class SmallReservationMapper {
    public SmallResrvationDTO toDTO(Reservation entity) {
        if(entity==null)return null;
        return SmallResrvationDTO.builder()
                .id(entity.getId())
                .dateArrive(entity.getDateArrive())
                .dateDepart(entity.getDateDepart())
                .nbrPersonnes(entity.getNbrPersonnes())
                .build();
    }
}
