package com.sparta.myselectshopbeta.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false; //admin 확인
    private String adminToken = "";
}