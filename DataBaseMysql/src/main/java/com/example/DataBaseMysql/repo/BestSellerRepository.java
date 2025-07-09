package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.BestSellerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestSellerRepository extends JpaRepository<BestSellerModel, Long> {
}
