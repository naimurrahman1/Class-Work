package com.bjitacademy.securityModule.controller;

import com.bjitacademy.securityModule.model.UserRequestModel;
import com.bjitacademy.securityModule.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserRequestModel requestModel){
        return userService.register(requestModel);
    }



}