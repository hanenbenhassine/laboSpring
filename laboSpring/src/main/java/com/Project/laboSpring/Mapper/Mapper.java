package com.Project.laboSpring.Mapper;

public interface Mapper <DTO,ENTITY>{
    DTO toDTO(ENTITY entity);
    ENTITY toEntity(DTO entity);
}
