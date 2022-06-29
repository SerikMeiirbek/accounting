package com.cydeo.model;

import com.cydeo.enums.Month;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Data
@Where(clause = "is_deleted=false")
public class Payment extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private Month month;
    private LocalDateTime year;
    private BigDecimal amount;
    private boolean is_paid = false;
    private Long institution_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


}
