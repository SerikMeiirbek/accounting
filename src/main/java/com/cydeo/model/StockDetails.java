package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "stock_details")
public class StockDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private LocalDateTime iDate;
    private Long quantity;
    private Long price;
    private Long remainingPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;



}



