package com.cydeo.controller;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.enums.State;
import com.cydeo.enums.Status;
import com.cydeo.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company")
public class CompanyController {


    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/list")
    public String getCompanyList(Model model) {
        model.addAttribute("companies",companyService.findAllCompanies());
        return "/company/company-list";
    }

    @GetMapping("/create")
    public String createCompany(Model model){
        model.addAttribute("company", new CompanyDTO());
        model.addAttribute("state", State.values());
        return "/company/company-add";
    }

    @PostMapping("/create")
    public String createCompany(CompanyDTO company){
        companyService.createCompany(company);
        return "redirect:/company/list";
    }
}
