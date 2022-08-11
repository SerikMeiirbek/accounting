package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDTO {

    @NotNull
    private Long id;

    @NotBlank
    @Size(min = 2, max = 20)
    private String name;

    private boolean enabled;
}
