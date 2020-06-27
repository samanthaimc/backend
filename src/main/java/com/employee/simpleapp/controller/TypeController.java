package com.employee.simpleapp.controller;

import com.employee.simpleapp.dto.TypeDTO;
import com.employee.simpleapp.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping
    public List<TypeDTO> getAllTypes() {
        return typeService.getAllTypes();
    }

    @GetMapping(path = "/{id}")
    public TypeDTO searchType(@PathVariable("id") int id) {
        return typeService.getType(id);
    }

    @PostMapping
    public boolean addType(@RequestBody TypeDTO dto) {
        return typeService.saveType(dto);
    }

    @PutMapping
    public boolean updateType(@RequestBody TypeDTO dto) {
        return typeService.updateType(dto);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteType(@PathVariable("id") int id) {
        return typeService.deleteType(id);
    }
}
