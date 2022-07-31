package com.cydeo.service;

import com.cydeo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

  List<CategoryDTO> findAllCategories();

  CategoryDTO createACategory(CategoryDTO categoryDTO);

  CategoryDTO findById(Long id);

  void update(CategoryDTO categoryDTO);

  void deleteById(long categoryId);





}
