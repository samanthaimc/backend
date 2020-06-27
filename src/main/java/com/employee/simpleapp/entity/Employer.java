package com.employee.simpleapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer {
    @Id
    private String id;
    private String name;
    private String address;
    private String tp;
    @OneToOne(cascade = CascadeType.ALL)
    private Department department;
    @OneToOne(cascade = CascadeType.ALL)
    private Type jobType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Family> family = new ArrayList<>();

    public Employer() {
    }

    public Employer(String id, String name, String address, String tp, Department department, Type jobType, List<Family> family) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tp = tp;
        this.department = department;
        this.jobType = jobType;
        this.family = family;
    }

    public Type getJobType() {
        return jobType;
    }

    public void setJobType(Type jobType) {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Family> getFamily() {
        return family;
    }

    public void setFamily(List<Family> family) {
        this.family = family;
    }
}
