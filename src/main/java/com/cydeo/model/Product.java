package com.cydeo.model;

import com.cydeo.enums.Status;
import com.cydeo.enums.Unit;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Data
public class Product extends BaseEntity{

    private String name;
    private String description;
    private Long low_limit_alert;
    @Enumerated(EnumType.STRING)
    private Unit unit;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;



//    @ManyToMany(mappedBy = "company_id",cascade = CascadeType.ALL)
//    @JoinColumn(name = "invoice_product")
//    private Invoice invoice;

//    @OneToOne
//   private StockDetails stockDetails;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
