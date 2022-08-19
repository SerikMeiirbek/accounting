package com.cydeo.model;

import com.cydeo.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "company")
@Where(clause = "is_deleted=false")
public class Company extends BaseEntity{

    private String title;
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
