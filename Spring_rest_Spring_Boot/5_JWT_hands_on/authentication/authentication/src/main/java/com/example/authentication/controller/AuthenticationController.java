package com.example.authentication.controller;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.authentication.model.AuthenticationRespons;
import com.example.authentication.util.*;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationRespons authenticate(@RequestHeader("Authorization") String authHeader) {

        String base64 = authHeader.substring("Basic ".length());

        String credentials = new String(Base64.getDecoder().decode(base64));

        String username = credentials.split(":")[0];

        String token = JwtUtil.generateToken(username);

        return new AuthenticationRespons(token);
    }
}