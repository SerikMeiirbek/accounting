package com.cydeo.service.serviceImp;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.model.Company;
import com.cydeo.repository.CompanyRepository;
import com.cydeo.service.CompanyService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final MapperUtil mapperUtil;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil mapperUtil) {
        this.companyRepository = companyRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<CompanyDTO> findAllCompanies() {
        List<Company> company = companyRepository.findAll();
        List<CompanyDTO> companyList = company.stream().map(c -> mapperUtil.convert(c, new CompanyDTO())).collect(Collectors.toList());
        return companyList;
    }

    @Override
    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company company = mapperUtil.convert(companyDTO, new Company());
        companyRepository.save(company);
        return mapperUtil.convert(company, new CompanyDTO());
    }

    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
