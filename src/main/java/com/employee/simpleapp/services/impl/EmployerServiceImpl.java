package com.employee.simpleapp.services.impl;

import com.employee.simpleapp.dto.EmployerDTO;
import com.employee.simpleapp.entity.Employer;
import com.employee.simpleapp.repo.EmployerRepo;
import com.employee.simpleapp.services.EmplyerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployerServiceImpl implements EmplyerService {
    @Autowired
    EmployerRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<EmployerDTO> getAllEmployers() {
        List<Employer> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<EmployerDTO>>() {
        }.getType());
    }

    @Override
    public EmployerDTO getEmployer(String id) {
        Optional<Employer> byId = repo.findById(id);
        return mapper.map(byId.get(), EmployerDTO.class);
    }

    @Override
    public boolean saveEmployer(EmployerDTO dto) {
        Employer map = mapper.map(dto, Employer.class);
        Employer save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean updateEmployer(EmployerDTO dto) {
        Employer map = mapper.map(dto, Employer.class);
        Employer save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean deleteEmployer(String id) {
        Optional<Employer> byId = repo.findById(id);
        repo.delete(byId.get());
        return true;
    }
}
