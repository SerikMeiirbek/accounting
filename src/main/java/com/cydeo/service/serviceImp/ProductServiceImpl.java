package com.cydeo.service.serviceImp;


import com.cydeo.dto.ProductDTO;
import com.cydeo.model.Product;
import com.cydeo.repository.ProductRepository;
import com.cydeo.service.ProductService;
import com.cydeo.util.MapperUtil;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MapperUtil mapperUtil;

    public ProductServiceImpl(ProductRepository productRepository, MapperUtil mapperUtil) {
        this.productRepository = productRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<ProductDTO> findAllProducts() {
         List<Product> productList = productRepository.findAll();
          return   productList.stream().map(p-> mapperUtil.convert(p, new ProductDTO())).collect(Collectors.toList());

    }

    @Override
    public ProductDTO registerAProduct(ProductDTO productDTO) {
            Product product = productRepository.save(mapperUtil.convert(productDTO, new Product()));

               return  mapperUtil.convert(product, new ProductDTO());

    }

    @Override
    public ProductDTO findById(long productId) {
        Product product = productRepository.findById(productId).get();
          return  mapperUtil.convert(product, new ProductDTO());
    }


    @Override
    public void update(ProductDTO productDTO) {
        Optional<Product> product = productRepository.findById(productDTO.getId());
        Product convertedProduct = mapperUtil.convert(productDTO,new Product());
        convertedProduct.setId(product.get().getId());
        productRepository.save(convertedProduct);

    }


    @Override
    public void deleteById(long productId) {
     productRepository.deleteById(productId);
    }
}
