package com.ltdd.bt104.payload;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private String fullName;
}