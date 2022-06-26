package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "stock_details")
@Where(clause = "is_deleted=false")
public class StockDetails extends BaseEntity{


    private LocalDateTime iDate;
    private Long quantity;
    private Long price;
    private Long remainingQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;



}



