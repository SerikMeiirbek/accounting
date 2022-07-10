package com.cydeo.controller;

import com.cydeo.dto.ProductDTO;
import com.cydeo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getAllProducts(Model model) {
        List<ProductDTO> productList = productService.getAllProducts();
        model.addAttribute("products_list", productList);

        return "product-list";
    }

    @GetMapping("/get/{productId}")
    public String getById(@PathVariable("productId") Long productId) {
        productService.findById(productId);

        return "product-list"; //Returning same view of product-list

    }

    @PostMapping("/create")///????
    public String createProduct(Model model, ProductDTO productDTO) {
        model.addAttribute("product", new ProductDTO());

        //productService.registerAProduct(productDTO); ///Not sure???

        return "product-add";
    }

    @GetMapping("/update")
    public String updateProduct(Long productId) {
        productService.updateById(productId);

        return "product-edit";
    }

    @GetMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        productService.deleteById(productId);
        return "redirect:/product-list";
    }
}
