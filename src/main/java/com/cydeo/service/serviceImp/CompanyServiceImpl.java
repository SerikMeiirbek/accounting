package com.cydeo.service.serviceImp;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.model.Company;
import com.cydeo.repository.CompanyRepository;
import com.cydeo.service.CompanyService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        Company company = companyRepository.save(mapperUtil.convert(companyDTO, new Company()));

        return mapperUtil.convert(company, new CompanyDTO());
    }

    @Override
    public CompanyDTO findById(Long id) {
        Optional<Company> company = companyRepository.findById(id);
          return mapperUtil.convert(company, new CompanyDTO());
    }

    @Override
    public void update(CompanyDTO companyDTO) {
        Optional<Company> company = companyRepository.findById(companyDTO.getId());
             Company convertedCompany = mapperUtil.convert(companyDTO, new Company());
             convertedCompany.setId(company.get().getId());
              companyRepository.save(convertedCompany);
    }

    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
