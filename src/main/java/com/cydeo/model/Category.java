package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;




@Entity
@NoArgsConstructor
@Data
@Where(clause = "is_deleted=false")
public class Category extends BaseEntity{

    private String description;
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


}
