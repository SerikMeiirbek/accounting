package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.CompanyService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

     private final UserService userService;
     private final CompanyService companyService;
     private final RoleService roleService;

    public UserController(UserService userService, CompanyService companyService, RoleService roleService) {
        this.userService = userService;
        this.companyService = companyService;
        this.roleService = roleService;
    }

    @GetMapping("/list")
    public String getUserList(Model model){
    model.addAttribute("users", userService.findAllUsers());
        return "/user/user-list";
    }

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());
        model.addAttribute("company", companyService.findAllCompanies());
        model.addAttribute("role", roleService.findAllRoles());
        return "/user/user-add";
    }

    @PostMapping("/create")
    public String createUser(UserDTO user){
        userService.registerAUser(user);
        return "redirect:/user/list";
        model.addAttribute("user", new UserDTO());
        model.addAttribute("company", companyService.findAllCompanies());
        model.addAttribute("role", roleService.findAllRoles());

        return "/user/user-add";

    }
}
