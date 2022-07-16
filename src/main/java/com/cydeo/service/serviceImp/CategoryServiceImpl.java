package com.cydeo.service.serviceImp;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.model.Category;
import com.cydeo.repository.CategoryRepository;
import com.cydeo.service.CategoryService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

       private final CategoryRepository categoryRepository;
       private final MapperUtil mapperUtil;

    public CategoryServiceImpl(CategoryRepository categoryRepository, MapperUtil mapperUtil) {
        this.categoryRepository = categoryRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();
         return categoryList.stream().map(c -> mapperUtil.convert(c, new CategoryDTO())).collect(Collectors.toList());

    }

    @Override
    public CategoryDTO createACategory(CategoryDTO categoryDTO) {
        categoryRepository.save(mapperUtil.convert(categoryDTO, new Category()));
          return categoryDTO;
    }

    @Override
    public CategoryDTO findById(long categoryId) {
        Category category = categoryRepository.findById(categoryId).get();

        return mapperUtil.convert(category, new CategoryDTO());
    }

    //TODO: work on update
    @Override
    public void updateById(long categoryId) {

    }

    @Override
    public void deleteById(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
