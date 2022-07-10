package com.cydeo.controller;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

     private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String getAllCategories(Model model){

      List<CategoryDTO> categoryList = categoryService.getAllCategories();

        model.addAttribute("categories",categoryList);

        return "category-list";
    }
}
