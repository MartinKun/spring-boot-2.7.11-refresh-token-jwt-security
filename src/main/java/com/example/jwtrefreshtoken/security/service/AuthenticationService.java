package com.example.jwtrefreshtoken.security.service;

import com.example.jwtrefreshtoken.security.controller.request.AuthenticationRequest;
import com.example.jwtrefreshtoken.security.controller.request.RegisterRequest;
import com.example.jwtrefreshtoken.security.controller.response.AuthenticationResponse;

import javax.servlet.http.HttpServletRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

    AuthenticationResponse refreshToken(HttpServletRequest request);
}
