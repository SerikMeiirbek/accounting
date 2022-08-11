package com.cydeo.dto;

import com.cydeo.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String address1;

    private String address2;

    @NotNull
    private String zip;

    private String representative;

    @NotNull
    private String email;


    private LocalDate establishmentDate;
    private boolean enabled;

    @NotNull
    private String phone;


}
