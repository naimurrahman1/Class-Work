package com.bjitacademy.securityModule.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseModel {
    private String userName;
    private String email;
    private String firstName;
    private String lastName;

}
