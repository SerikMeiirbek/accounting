package com.cydeo.dto;

import com.cydeo.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockDetailsDTO {

    private Long id;
    private LocalDateTime iDate;
    private Long quantity;
    private Long price;
    private Long remainingQuantity;

    private Product product;
}
