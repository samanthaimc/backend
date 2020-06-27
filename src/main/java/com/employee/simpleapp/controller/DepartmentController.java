package com.employee.simpleapp.controller;

import com.employee.simpleapp.dto.DepartmentDTO;
import com.employee.simpleapp.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/department")
public class DepartmentController {

    @Autowired
    DepartmentService dpService;

    @GetMapping
    public List<DepartmentDTO> getAllDepartments() {
        return dpService.getAllDepartments();
    }

    @GetMapping(path = "/{id}")
    public DepartmentDTO searchDepartments(@PathVariable("id") int id) {
        return dpService.getDepartment(id);
    }

    @PostMapping
    public boolean addDepartments(@RequestBody DepartmentDTO dto) {
        return dpService.saveDepartments(dto);
    }

    @PutMapping
    public boolean updateDepartments(@RequestBody DepartmentDTO dto) {
        return dpService.updateDepartments(dto);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteDepartments(@PathVariable("id") int id) {
        return dpService.deleteDepartments(id);
    }
}
