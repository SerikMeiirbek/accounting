package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String passWord;
    private boolean enabled;
    private String phone;
}
