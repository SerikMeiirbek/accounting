package com.cydeo.service;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.dto.ProductDTO;
import com.cydeo.enums.Status;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO registerAProduct(ProductDTO productDTO); //Method naming convention???

    ProductDTO createANewProductCategory(CategoryDTO categoryDTO);//Not sure?

    ProductDTO findByStatus(Status status); //Not sure

    ProductDTO findByCategory(CategoryDTO categoryDTO); //???

    ProductDTO findById(long productId);

    void updateById(long productId);

    void deleteById(long productId);
}
