package com.employee.simpleapp.services;

import com.employee.simpleapp.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentService {

    List<DepartmentDTO> getAllDepartments();

    DepartmentDTO getDepartment(int id);

    boolean saveDepartments(DepartmentDTO dto);

    boolean updateDepartments(DepartmentDTO dto);

    boolean deleteDepartments(int id);

}
