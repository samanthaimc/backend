package com.employee.simpleapp.repo;

import com.employee.simpleapp.entity.Employer;
import com.employee.simpleapp.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepo extends JpaRepository<Family, String> {
}
