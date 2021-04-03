package com.Project.laboSpring.services;

import com.Project.laboSpring.dto.ChambreDTO;
import com.Project.laboSpring.exception.ElementAlreadyExistsException;
import com.Project.laboSpring.exception.ElementNotFoundException;

import java.util.List;

public class ChambreServiceImpl implements ChambreService{
    @Override
    public void insert(ChambreDTO toInsert) throws ElementAlreadyExistsException {

    }

    @Override
    public ChambreDTO getOne(Integer integer) throws ElementNotFoundException {
        return null;
    }

    @Override
    public List<ChambreDTO> getAll() {
        return null;
    }

    @Override
    public void update(ChambreDTO toUpdate, Integer integer) throws ElementNotFoundException {

    }

    @Override
    public void delete(Integer integer) throws ElementNotFoundException {

    }
}
