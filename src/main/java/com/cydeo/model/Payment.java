package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Data
public class Payment extends BaseEntity{

    private String month;
    private LocalDateTime year;
    private BigDecimal amount;
    private boolean is_paid = false;
    private Long institution_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


}
