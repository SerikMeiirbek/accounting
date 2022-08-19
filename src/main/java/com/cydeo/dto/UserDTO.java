package com.cydeo.dto;


import com.cydeo.enums.Status;

import com.cydeo.model.Company;
import com.cydeo.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 2, max = 20)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 20)
    private String lastName;

    @NotNull
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String passWord;

    private boolean enabled;

    @NotBlank
    private String phone;

    @NotNull
    private Role role;

    private Company company;
}
