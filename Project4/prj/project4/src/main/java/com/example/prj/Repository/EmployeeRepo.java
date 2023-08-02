package com.example.proj1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proj.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}
