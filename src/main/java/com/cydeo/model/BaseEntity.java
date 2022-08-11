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
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    private LocalDateTime createdTime;

    @Column(nullable = false)
    private LocalDateTime updatedTime;

    @Column(nullable = false,updatable = false)
    private Long createdUserId;

    @Column(nullable = false)
    private Long updatedUserId;

    private Boolean isDeleted=false;

    @PrePersist
    public void onPrePersist(){
        this.createdTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
        this.createdUserId = 1L;
        this.updatedUserId = 1L;
    }

    @PreUpdate
    public void onPreUpdate(){
        this.updatedTime = LocalDateTime.now();
        this.updatedUserId = 1L;
    }

}
