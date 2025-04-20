package com.softserve.itacademy.todolist.controller;

import com.softserve.itacademy.todolist.dto.UserRequestDto;
import com.softserve.itacademy.todolist.service.impl.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthServiceImpl authService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UserRequestDto request) {
        String token = authService.authenticate(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(Map.of("token", token));
    }

}
