package com.cydeo.service;

import com.cydeo.dto.PaymentDTO;
import com.cydeo.enums.Month;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface PaymentService {

    List<PaymentDTO> getAllPayments(); //??? might filter

    PaymentDTO findByMonth(Month month);

    PaymentDTO findByYear(LocalDate localDate);

    PaymentDTO fidByAmount(BigDecimal amount);

    PaymentDTO findByInstitutionId();

   PaymentDTO createPayment(PaymentDTO paymentDTO);//???

      //Update-> no payment id?
      //Delete
}
