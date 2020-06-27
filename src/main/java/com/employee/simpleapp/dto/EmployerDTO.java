package com.employee.simpleapp.dto;

import com.employee.simpleapp.entity.Type;

import java.util.ArrayList;
import java.util.List;


public class EmployerDTO {

    private String id;
    private String name;
    private String address;
    private String tp;
    private DepartmentDTO department;
    private List<FamilyDTO> family = new ArrayList<>();
    private TypeDTO jobType;

    public EmployerDTO() {
    }

    public EmployerDTO(String id, String name, String address, String tp, DepartmentDTO department, TypeDTO jobType, List<FamilyDTO> family) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tp = tp;
        this.department = department;
        this.family = family;
        this.jobType = jobType;
    }

    public TypeDTO getJobType() {
        return jobType;
    }

    public void setJobType(TypeDTO jobType) {
        this.jobType = jobType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public List<FamilyDTO> getFamily() {
        return family;
    }

    public void setFamily(List<FamilyDTO> family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "EmployerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tp='" + tp + '\'' +
                ", department=" + department +
                ", family=" + family +
                '}';
    }
}
