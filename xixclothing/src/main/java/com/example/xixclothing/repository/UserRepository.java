package com.example.xixclothing.repository;

import com.example.xixclothing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
