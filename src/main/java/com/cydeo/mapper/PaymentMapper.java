package com.cydeo.mapper;

import com.cydeo.dto.PaymentDTO;
import com.cydeo.model.Payment;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    private final ModelMapper modelMapper;

    public PaymentMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public Payment convertToEntity(PaymentDTO dto){
        return modelMapper.map(dto,Payment.class);
    }

    public PaymentDTO convertToDto(Payment entity){
        return modelMapper.map(entity,PaymentDTO.class);
    }
}
