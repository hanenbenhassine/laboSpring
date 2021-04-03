package com.Project.laboSpring.services;

import com.Project.laboSpring.exception.ElementAlreadyExistsException;
import com.Project.laboSpring.exception.ElementNotFoundException;

import java.util.List;

public interface CrudService <DTO,ID>{
    void insert(DTO toInsert)throws ElementAlreadyExistsException;
    DTO getOne(ID id)throws ElementNotFoundException;
    List<DTO> getAll();
    void update(DTO toUpdate, ID id)throws ElementNotFoundException;
    void delete(ID id)throws ElementNotFoundException;

}
