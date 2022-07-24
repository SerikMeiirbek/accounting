package com.cydeo.service;


import com.cydeo.dto.ProductDTO;


import java.util.List;

public interface ProductService {

    List<ProductDTO> findAllProducts();

    ProductDTO registerAProduct(ProductDTO productDTO);

    ProductDTO findById(long productId);

    void update(ProductDTO productDTO);

    //void update(ProductDTO productDTO, Long productId);

    void deleteById(long productId);
}
