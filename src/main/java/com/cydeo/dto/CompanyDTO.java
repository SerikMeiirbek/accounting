package com.cydeo.dto;

import com.cydeo.enums.State;
import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
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
    @Email
    private String email;

    @NotNull
    @Pattern(regexp = "^\\d{10}$")
    @Size(max = 10)
    private String phone;

    @NotNull
    @Size(max = 5)
    private String zip;

     @NotNull
     private State state;

     @NotBlank
     private Status status;

     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
     private LocalDate establishmentDate;

     private boolean enabled;




}
