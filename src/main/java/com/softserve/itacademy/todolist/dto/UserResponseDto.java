package com.softserve.itacademy.todolist.dto;

import com.softserve.itacademy.todolist.model.User;
import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String email;
    private String role;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.role = user.getRole().getName();
    }
}
