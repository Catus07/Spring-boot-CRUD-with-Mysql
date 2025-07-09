package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentModel,Long> {
}
