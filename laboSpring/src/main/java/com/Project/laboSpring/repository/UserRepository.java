package com.Project.laboSpring.repository;

import com.Project.laboSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    //@Query("SELECT u From User WHERE u.username=?1")
    Optional<User>findByUsername(String username);
}
