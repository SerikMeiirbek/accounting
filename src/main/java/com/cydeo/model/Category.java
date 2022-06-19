package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;




@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity{

    private String description;
    private boolean enabled = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") //company_id or category_id?
    private Product product;

}
