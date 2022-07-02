package com.cydeo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.lang.reflect.Type;

/**
 * This MapperUtil is a generic type and can be used instead of other Mapper classes
 */
@Component
public class MapperUtil {

    private final ModelMapper modelMapper;

    public MapperUtil(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public <T> T convert(Object objectToBeConverted, T convertedObject){
        return modelMapper.map(objectToBeConverted,(Type)convertedObject.getClass());
    }
}
