package com.cydeo.service;

import com.cydeo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

  List<CategoryDTO> findAllCategories();

  CategoryDTO createACategory(CategoryDTO categoryDTO);

  CategoryDTO findById(long categoryId);

  void update(CategoryDTO categoryDTO);

  void deleteById(long categoryId);





}
