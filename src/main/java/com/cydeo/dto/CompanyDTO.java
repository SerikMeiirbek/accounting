package com.cydeo.dto;

import com.cydeo.enums.State;
import com.cydeo.enums.Status;
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
    private String title;

    private String representative;

    @NotBlank
    private String address1;

    private String address2;

    @NotNull
    private String email;

    @NotNull
    private String phone;

    @NotNull
    private String zip;

     @NotNull
     private State state;

     @NotBlank
     private Status status;

     private LocalDate establishmentDate;

     private boolean enabled;




}
