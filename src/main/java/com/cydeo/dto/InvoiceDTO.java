package com.cydeo.dto;

import com.cydeo.enums.InvoiceStatus;
import com.cydeo.enums.InvoiceType;
import com.cydeo.model.ClientVendor;
import com.cydeo.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InvoiceDTO {
    private Long id;
    private String invoiceNumber;
    private InvoiceStatus invoiceStatus;
    private InvoiceType invoiceType;
    private LocalDate invoiceDate;
    private ClientVendor clientVendor;
    private Company company;
    private boolean enabled;
}
