package com.employee.simpleapp.controller;

import com.employee.simpleapp.dto.EmployerDTO;
import com.employee.simpleapp.services.EmplyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/employer")
public class EmployerController {

    @Autowired
    EmplyerService empService;

    @GetMapping
    public List<EmployerDTO> getAllEmployers() {
        return empService.getAllEmployers();
    }

    @GetMapping(path = "/{id}")
    public EmployerDTO searchEmployer(@PathVariable("id") String id) {
        return empService.getEmployer(id);
    }

    @PostMapping
    public boolean addEmployer(@RequestBody EmployerDTO dto) {
        return empService.saveEmployer(dto);
    }

    @PutMapping
    public boolean updateEmployer(@RequestBody EmployerDTO dto) {
        return empService.updateEmployer(dto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployer(@PathVariable("id") String id) {
        return empService.deleteEmployer(id);
    }

}
