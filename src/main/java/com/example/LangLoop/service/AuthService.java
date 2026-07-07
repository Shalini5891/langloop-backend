package com.example.LangLoop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.SystemUser;
import com.example.LangLoop.repository.SystemUserRepository;
import com.example.LangLoop.service.JwtService;

@Service
public class AuthService {

    @Autowired
    private SystemUserRepository systemUserRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public SystemUser register(String username, String password, String role) {
        if (systemUserRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("Username already exists: " + username);
        }

        SystemUser user = new SystemUser();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(SystemUser.Role.valueOf(role.toUpperCase()));

        return systemUserRepository.save(user);
    }

    public String login(String username, String password) {
        SystemUser user = systemUserRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Invalid username or password"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }

        return jwtService.generateToken(user.getUsername());
    }
}