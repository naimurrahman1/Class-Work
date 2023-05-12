package com.bjit.exceptionhandling.controller;
import com.bjit.exceptionhandling.exception.ManagerNotFound;
import com.bjit.exceptionhandling.exception.EmployeeNotFound;
import com.bjit.exceptionhandling.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/info-detail/{id}")
    public ResponseEntity<Object> getEmployeeInfo(@PathVariable Integer id) {
        if (id == 1001) {
            Employee employee = new Employee(1001, "Tanvir Hossain");
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            throw new EmployeeNotFound("Employee not found");
        }
    }

    @GetMapping("/get-value")
    public ResponseEntity<Object> MathOperation() {
        throw new ArithmeticException("Arithmatic Error");
    }
}