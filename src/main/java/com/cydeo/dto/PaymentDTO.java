package com.cydeo.dto;


import com.cydeo.dto.enums.Month;
import com.cydeo.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDTO {

    @NotNull
    private Month month;

    @NotNull
    private LocalDate year;

    @NotNull
    private BigDecimal amount;

    private boolean is_paid;

    @NotNull
    private Long institution_id;

    @NotNull
    private Company company;

}
