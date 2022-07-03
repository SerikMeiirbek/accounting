package com.cydeo.dto;

import com.cydeo.model.Invoice;
import com.cydeo.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InvoiceProductDTO {
    private Long id;
    private Invoice invoice;
    private Product product;
    private String name;
    private Long qty;
    private Long price;
    private Long tax;
    private Long profit;
}
