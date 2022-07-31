package com.cydeo.controller;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

     private final CategoryService categoryService;



    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public String getAllCategories(Model model){
        List<CategoryDTO> categoryList = categoryService.findAllCategories();
        model.addAttribute("categories",categoryList);
        return "/category/category-list";
    }

    @GetMapping("/create")
    public String createACategory(Model model) {
        model.addAttribute("category", new CategoryDTO());
        return "/category/category-add";
    }


    @PostMapping("/create")
    public String createACategory(CategoryDTO category) {
        categoryService.createACategory(category);
        return "redirect:/category/list";
    }

    @GetMapping("/update/{id}")
    public String updateCategory(@PathVariable("id") Long id, Model model ){
        model.addAttribute("category",categoryService.findById(id));
        return "/category/category-edit";
    }

    @PostMapping("/update/{id}")
    public String updateCategory(CategoryDTO categoryDTO){
        categoryService.update(categoryDTO);
        return "redirect:/category/list";
    }


    @GetMapping("delete/{id}")
    public String deleteCategory(@PathVariable("id") Long id){
        categoryService.deleteById(id);
        return "redirect:/category/list";
    }




}
