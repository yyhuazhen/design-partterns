package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginModel {
    private String userName;
    private String password;
    private String userId;
}
