package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String employeeCode;
    private String password;
    private String role;
}
