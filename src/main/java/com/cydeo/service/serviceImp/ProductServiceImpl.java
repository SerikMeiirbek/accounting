package com.cydeo.service.serviceImp;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.dto.ProductDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDTO> getAllProducts() {
        return null;
    }

    @Override
    public ProductDTO registerAProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO createANewProductCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ProductDTO findByStatus(Status status) {
        return null;
    }

    @Override
    public ProductDTO findByCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ProductDTO findById(long productId) {
        return null;
    }

    @Override
    public void updateById(long productId) {

    }

    @Override
    public void deleteById(long productId) {

    }
}
