package com.mysite.backend.repository;

import com.mysite.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContainsOrUsernameContains(String name, String username);
}
