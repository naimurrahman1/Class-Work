package com.bjitacademy.securityModule.service;

import com.bjitacademy.securityModule.model.UserRequestModel;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<Object> register(UserRequestModel requestModel);
    //ResponseEntity<Object> response(UserRequestModel requestModel);
}
