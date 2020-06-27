package com.employee.simpleapp.repo;

import com.employee.simpleapp.entity.Department;
import com.employee.simpleapp.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
