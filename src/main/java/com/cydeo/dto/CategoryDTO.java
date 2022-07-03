package com.cydeo.dto;


import com.cydeo.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String description;

    private boolean enabled;

    @NotNull
    private Company company;

}
