package com.csai.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.csai.mall.model.User;

public interface UserRepository extends JpaRepository<User, String> {
  // List<User> findByName(String name);
}
