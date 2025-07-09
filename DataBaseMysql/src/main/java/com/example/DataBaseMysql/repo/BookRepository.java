package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.NewBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<NewBookModel, Long> {
}
