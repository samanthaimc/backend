package com.employee.simpleapp.services.impl;

import com.employee.simpleapp.dto.DepartmentDTO;
import com.employee.simpleapp.entity.Department;
import com.employee.simpleapp.repo.DepartmentRepo;
import com.employee.simpleapp.services.DepartmentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<Department> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DepartmentDTO>>() {
        }.getType());
    }

    @Override
    public DepartmentDTO getDepartment(int id) {
        Optional<Department> byId = repo.findById(id);
        return mapper.map(byId.get(), DepartmentDTO.class);
    }

    @Override
    public boolean saveDepartments(DepartmentDTO dto) {
        Department map = mapper.map(dto, Department.class);
        Department save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean updateDepartments(DepartmentDTO dto) {
        Department map = mapper.map(dto, Department.class);
        Department save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean deleteDepartments(int id) {
        Optional<Department> byId = repo.findById(id);
        repo.delete(byId.get());
        return true;
    }
}
