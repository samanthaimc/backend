package com.employee.simpleapp.services.impl;

import com.employee.simpleapp.dto.EmployerDTO;
import com.employee.simpleapp.dto.TypeDTO;
import com.employee.simpleapp.entity.Type;
import com.employee.simpleapp.repo.TypeRepo;
import com.employee.simpleapp.services.TypeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<TypeDTO> getAllTypes() {
        List<Type> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<TypeDTO>>() {
        }.getType());
    }

    @Override
    public TypeDTO getType(int id) {
        Optional<Type> byId = repo.findById(id);
        return mapper.map(byId.get(), TypeDTO.class);
    }

    @Override
    public boolean saveType(TypeDTO dto) {
        Type map = mapper.map(dto, Type.class);
        Type save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean updateType(TypeDTO dto) {
        Type map = mapper.map(dto, Type.class);
        Type save = repo.save(map);
        return save != null;
    }

    @Override
    public boolean deleteType(int id) {
        Optional<Type> byId = repo.findById(id);
        repo.delete(byId.get());
        return true;
    }
}
