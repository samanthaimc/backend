package com.employee.simpleapp.services;

import com.employee.simpleapp.dto.EmployerDTO;

import java.util.List;

public interface EmplyerService {

    List<EmployerDTO> getAllEmployers();

    EmployerDTO getEmployer(String id);

    boolean saveEmployer(EmployerDTO dto);

    boolean updateEmployer(EmployerDTO dto);

    boolean deleteEmployer(String id);

}
