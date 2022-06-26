package com.cydeo.model;

import com.cydeo.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "company")
@Where(clause = "is_deleted=false")
public class Company extends BaseEntity{

    private String address1;
    private String address2;
    private String zip;
    private String representative;
    private String email;
    @Column(columnDefinition = "Date")
    private LocalDate establishmentDate;
    private boolean enabled;
    private String phone;


    @Enumerated(EnumType.STRING)
    private State state;





}
