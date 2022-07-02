package com.cydeo.mapper;

import com.cydeo.dto.CategoryDTO;
import com.cydeo.model.Category;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {


    private final ModelMapper modelMapper;

    public CategoryMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public Category convertToEntity(CategoryDTO dto){
        return modelMapper.map(dto,Category.class);
    }

    public CategoryDTO convertToDto(Category entity){
        return modelMapper.map(entity,CategoryDTO.class);
    }
}
