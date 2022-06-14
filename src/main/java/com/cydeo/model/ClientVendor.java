package com.cydeo.model;

import com.cydeo.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "client_vendor")
@Where(clause = "is_deleted=false")
public class ClientVendor extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_name")
    private Company companyTitle;
    private String phone;
    private String email;
    @JoinColumn(name = "company_id")
    private Company companyId;
    @Enumerated(EnumType.STRING)
    private CompanyType type;
    private String zipCode;
    private String address;
    @Enumerated(EnumType.STRING)
    private State stateId;



}
