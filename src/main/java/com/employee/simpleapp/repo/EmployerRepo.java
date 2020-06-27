package com.employee.simpleapp.repo;

import com.employee.simpleapp.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepo extends JpaRepository<Employer, String> {
}
