package com.employee.simpleapp.services;

import com.employee.simpleapp.dto.FamilyDTO;

import java.util.List;

public interface FamilyService {

    List<FamilyDTO> getAllFamily();

    FamilyDTO getFamily(String id);

    boolean saveFamily(FamilyDTO dto);

    boolean updateFamily(FamilyDTO dto);

    boolean deleteFamily(String id);

}
