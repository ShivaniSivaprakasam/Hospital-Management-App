package com.bridgelabz.hospitalmanagement.controller;

import com.bridgelabz.hospitalmanagement.dto.AuthRequest;
import com.bridgelabz.hospitalmanagement.dto.AuthResponse;
import com.bridgelabz.hospitalmanagement.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request) {
        return authService.registerUser(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.loginUser(request);
    }
}
