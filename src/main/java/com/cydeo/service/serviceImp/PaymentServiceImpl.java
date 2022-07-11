package com.cydeo.service.serviceImp;

import com.cydeo.dto.PaymentDTO;
import com.cydeo.model.Payment;
import com.cydeo.repository.PaymentRepository;
import com.cydeo.service.PaymentService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PaymentServiceImpl implements PaymentService {

      private final PaymentRepository paymentRepository;

      private final MapperUtil mapperUtil;

    public PaymentServiceImpl(PaymentRepository paymentRepository, MapperUtil mapperUtil) {
        this.paymentRepository = paymentRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<PaymentDTO> getAllPayments() {
        List<Payment> paymentList = paymentRepository.findAll();

          return paymentList.stream().map(p -> mapperUtil.convert(p, new PaymentDTO())).collect(Collectors.toList());

    }


}
