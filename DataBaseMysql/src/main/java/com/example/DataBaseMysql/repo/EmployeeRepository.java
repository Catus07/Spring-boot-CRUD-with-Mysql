package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
