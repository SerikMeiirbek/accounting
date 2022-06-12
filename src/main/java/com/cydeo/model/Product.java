package com.cydeo.model;

import com.cydeo.enums.Status;
import com.cydeo.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    private String name;
    private String category;
    private String description;
    private Long low_limit_alert;
    private Unit unit;
    private Status status;

    //Quantity?
    //Edit

}
