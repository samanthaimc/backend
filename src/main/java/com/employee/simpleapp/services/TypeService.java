package com.employee.simpleapp.services;

import com.employee.simpleapp.dto.EmployerDTO;
import com.employee.simpleapp.dto.TypeDTO;

import java.util.List;

public interface TypeService {

    List<TypeDTO> getAllTypes();

    TypeDTO getType(int id);

    boolean saveType(TypeDTO dto);

    boolean updateType(TypeDTO dto);

    boolean deleteType(int id);

}
