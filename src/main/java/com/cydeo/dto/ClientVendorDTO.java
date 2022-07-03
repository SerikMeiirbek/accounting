package com.cydeo.dto;

import com.cydeo.enums.CompanyType;
import com.cydeo.enums.State;
import com.cydeo.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientVendorDTO {
    private Long id;
    private String companyTitle;
    private String phone;
    private String email;
    private Company company;
    private CompanyType type;
    private String zipCode;
    private String address;
    private State stateId;
    private boolean enabled;
    
}