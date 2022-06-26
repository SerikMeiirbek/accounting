package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "user")
@Where(clause = "is_deleted=false")
public class User extends BaseEntity{

    private String email;
    private String firstName;
    private String lastName;
    private String passWord;
    private boolean enabled;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;





}
