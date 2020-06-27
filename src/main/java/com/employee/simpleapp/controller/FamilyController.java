package com.employee.simpleapp.controller;

import com.employee.simpleapp.dto.FamilyDTO;
import com.employee.simpleapp.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/family")
public class FamilyController {

    @Autowired
    FamilyService familyService;

    @GetMapping
    public List<FamilyDTO> getAllFamily() {
        return familyService.getAllFamily();
    }

    @GetMapping(path = "/{id}")
    public FamilyDTO searchFamily(@PathVariable("id") String id) {
        return familyService.getFamily(id);
    }

    @PostMapping
    public boolean addFamily(@RequestBody FamilyDTO dto) {
        return familyService.saveFamily(dto);
    }

    @PutMapping
    public boolean updateFamily(@RequestBody FamilyDTO dto) {
        return familyService.updateFamily(dto);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteFamily(@PathVariable("id") String id) {
        return familyService.deleteFamily(id);
    }

}
