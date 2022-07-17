package com.cydeo.service;


import com.cydeo.dto.ProductDTO;


import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO registerAProduct(ProductDTO productDTO);

    //ProductDTO createANewProductCategory(CategoryDTO categoryDTO);// Create in Category service

    //ProductDTO findByStatus(Status status); // If want to use create Repository

    //ProductDTO findByCategory(CategoryDTO categoryDTO); // Repository

    ProductDTO findById(long productId);

    void updateById(long productId);

    void deleteById(long productId);
}
