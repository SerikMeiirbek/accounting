package com.cydeo.controller;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.enums.State;
import com.cydeo.enums.Status;
import com.cydeo.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String createCompany(CompanyDTO company, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){

            model.addAttribute("company", companyService.findAllCompanies());
            return "/company/company-add";
        }
        companyService.createCompany(company);
        return "redirect:/company/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id")Long id, Model model){
       model.addAttribute("company", companyService.findById(id));
       model.addAttribute("state", State.values());
       return "/company/company-edit";
    }

    @PostMapping("/update/{id}")
    public String update(CompanyDTO companyDTO){
        companyService.update(companyDTO);
        return "redirect:/company/list";
    }
}
