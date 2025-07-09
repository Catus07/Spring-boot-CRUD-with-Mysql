package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel, Long> {
}
