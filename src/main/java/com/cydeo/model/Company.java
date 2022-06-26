package com.cydeo.model;

import com.cydeo.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
public class Company extends BaseEntity{

    private String address1;
    private String address2;
    private String zip;
    private String representative;
    private String email;
    @Column(columnDefinition = "Date")
    private LocalDate establishmentDate;
    private boolean enabled;
    private String createdBy;
    @Column(columnDefinition = "Date")
    private LocalDateTime createdTime;
    private String updatedBy;
    @Column(columnDefinition = "Date")
    private LocalDateTime updatedTime;
    private String phone;


    @Enumerated(EnumType.STRING)
    private State state;

    private boolean isDeleted;



}
