package com.cydeo.dto;

import com.cydeo.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyDTO {

    private Long id;
    private String address1;
    private String address2;
    private String zip;
    private String representative;
    private String email;
    private LocalDate establishmentDate;
    private boolean enabled;
    private String phone;

    private State state;

}
