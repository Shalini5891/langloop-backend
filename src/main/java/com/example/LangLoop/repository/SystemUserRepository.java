package com.example.LangLoop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LangLoop.entity.SystemUser;

import java.util.Optional;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {
    Optional<SystemUser> findByUsername(String username);
}
