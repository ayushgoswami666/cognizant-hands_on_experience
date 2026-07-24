package com.example.authentication.model;

public class AuthenticationRespons{

    private String token;

    public AuthenticationRespons(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
