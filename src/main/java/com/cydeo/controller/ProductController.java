package com.cydeo.controller;

import com.cydeo.dto.ProductDTO;
import com.cydeo.enums.Status;
import com.cydeo.enums.Unit;
import com.cydeo.service.CategoryService;
import com.cydeo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;
    private final CategoryService categoryService;


    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public String getAllProducts(Model model) {
        List<ProductDTO> productList = productService.findAllProducts();
        model.addAttribute("products", productList);

        return "/product/product-list";
    }


    @GetMapping("/create")
    public String createProduct(Model model) {

        model.addAttribute("product", new ProductDTO());
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("status", Status.values());
        model.addAttribute("unit", Unit.values());


        return "product/product-add";
    }

    @PostMapping("/create")
    public String createProduct(ProductDTO product) {
        productService.registerAProduct(product);
        return "redirect:/product/list";
    }


    @GetMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("category",categoryService.findAllCategories());
        model.addAttribute("unit", Unit.values());
        model.addAttribute("status", Status.values());
        return "/product/product-edit";
    }

    @PostMapping("/update")
    public String updateProduct(ProductDTO productDTO) {
        productService.update(productDTO);
        return "redirect:/product/list";
    }

    @GetMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        productService.deleteById(productId);
        return "redirect:/product/list";
    }
}
