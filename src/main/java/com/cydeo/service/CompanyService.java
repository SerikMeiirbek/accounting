package com.cydeo.service;

import com.cydeo.dto.CompanyDTO;

import com.sun.java.accessibility.util.TopLevelWindowListener;


import java.util.List;

public interface CompanyService {

    List<CompanyDTO> findAllCompanies();

    CompanyDTO createCompany(CompanyDTO companyDTO);

    CompanyDTO findById(Long id);

    void update(CompanyDTO companyDTO);

    void deleteById(Long  id);

}
