package com.cydeo.service;

import com.cydeo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

  List<CategoryDTO> getAllCategories();

  CategoryDTO createACategory(CategoryDTO categoryDTO);

  CategoryDTO findById(long categoryId);

  void updateById(long categoryId);

  void deleteById(long categoryId);





}
