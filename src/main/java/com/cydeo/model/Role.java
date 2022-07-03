package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name = "role")
public class Role extends BaseEntity{

    private String name;
    private boolean enabled;



}
