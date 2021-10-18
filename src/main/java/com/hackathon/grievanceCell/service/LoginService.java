package com.hackathon.grievanceCell.service;

import com.hackathon.grievanceCell.payload.request.LoginRequest;
import com.hackathon.grievanceCell.payload.response.JwtResponse;

public interface LoginService {

    Boolean checkUser(LoginRequest loginRequest);
    JwtResponse result(LoginRequest loginRequest);
}
