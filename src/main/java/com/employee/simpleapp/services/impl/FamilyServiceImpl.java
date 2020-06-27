package com.employee.simpleapp.services.impl;

import com.employee.simpleapp.dto.FamilyDTO;
import com.employee.simpleapp.entity.Family;
import com.employee.simpleapp.repo.FamilyRepo;
import com.employee.simpleapp.services.FamilyService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FamilyServiceImpl implements FamilyService {
    @Autowired
    FamilyRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<FamilyDTO> getAllFamily() {
        List<Family> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<FamilyDTO>>() {
        }.getType());
    }

    @Override
    public FamilyDTO getFamily(String id) {
        Optional<Family> byId = repo.findById(id);
        return mapper.map(byId.get(), FamilyDTO.class);
    }

    @Override
    public boolean saveFamily(FamilyDTO dto) {
        Family map = mapper.map(dto, Family.class);
        Family save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean updateFamily(FamilyDTO dto) {
        Family map = mapper.map(dto, Family.class);
        Family save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean deleteFamily(String id) {
        Optional<Family> byId = repo.findById(id);
        repo.delete(byId.get());
        return true;
    }
}
