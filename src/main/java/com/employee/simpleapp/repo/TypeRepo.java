package com.employee.simpleapp.repo;

import com.employee.simpleapp.entity.Employer;
import com.employee.simpleapp.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepo extends JpaRepository<Type, Integer> {
}
