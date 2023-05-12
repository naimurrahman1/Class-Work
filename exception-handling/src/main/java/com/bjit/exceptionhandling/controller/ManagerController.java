package com.bjit.exceptionhandling.controller;

import com.bjit.exceptionhandling.exception.ManagerNotFound;
import com.bjit.exceptionhandling.model.Manager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @GetMapping("/info-detail/{id}")
    public ResponseEntity<Object> getAdminInfo(@PathVariable Integer id) {
        if(id == 2001) {
            Manager manager = new Manager("Zubair Hossain");
            return new ResponseEntity<>(manager, HttpStatus.OK);
        } else {
            throw new ManagerNotFound("Manager not found");
        }
    }

    @GetMapping("/get-value")
    public ResponseEntity<Object> MathOperation() {
        throw new ArithmeticException("Arithmatic Error");
    }
}
