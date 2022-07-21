package com.cydeo.dto;


import com.cydeo.enums.Status;
import com.cydeo.enums.Unit;
import com.cydeo.model.Category;
import com.cydeo.model.Company;
import com.cydeo.model.Invoice;
import com.cydeo.model.StockDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    @NotNull
    private Long id;

    @NotBlank
    @Size(min = 2, max = 20)
    private String name;

    @NotBlank
    private Long quantity;

    @NotBlank
    @Size(min = 2, max = 20)
    private String description;

    @NotBlank
    private Long low_limit_alert;

    private Unit unit;
    private Status status;

    @NotNull
    private Company company;

    @NotNull
    private Category category;




}
