package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false,updatable = false)
    public LocalDateTime createdTime;

    @Column(nullable = false)
    public LocalDateTime updatedTime;

    @Column(nullable = false,updatable = false)
    public Long createdUserId;

    @Column(nullable = false)
    public Long updatedUserId;

    private Boolean isDeleted=false;



}
