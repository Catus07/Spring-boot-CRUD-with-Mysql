package com.example.DataBaseMysql.repo;

import com.example.DataBaseMysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
