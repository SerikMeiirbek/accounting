package com.cydeo.dto;


import com.cydeo.dto.enums.Status;
import com.cydeo.dto.enums.Unit;
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

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {


    @NotBlank
    @Size(min = 2, max = 20)
    private String name;

    @NotBlank
    @Size(min = 2, max = 20)
    private String description;

    @NotBlank // @NotBlank or @NotNull?
    private Long low_limit_alert;

    private Unit unit;
    private Status status;

    @NotNull
    private Company company;

    @NotNull
    private Category category;

    @NotNull
    private Invoice invoice; //Not sure if needs to be here

    @NotNull
    private StockDetails stockDetails; //Not sure the location


}
