package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "user")
@Entity
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

    private String createdBy;
    @Column(columnDefinition = "Data")
    private LocalDateTime createdTime;

    private String updatedBy;
    @Column(columnDefinition = "Date")
    private LocalDateTime updatedTime;
    private boolean isDeleted;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role role;





}
