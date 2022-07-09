package com.cydeo.service.serviceImp;

import com.cydeo.dto.PaymentDTO;
import com.cydeo.enums.Month;
import com.cydeo.service.PaymentService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public List<PaymentDTO> getAllPayments() {
        return null;
    }

    @Override
    public PaymentDTO findByMonth(Month month) {
        return null;
    }

    @Override
    public PaymentDTO findByYear(LocalDate localDate) {
        return null;
    }

    @Override
    public PaymentDTO fidByAmount(BigDecimal amount) {
        return null;
    }

    @Override
    public PaymentDTO findByInstitutionId() {
        return null;
    }

    @Override
    public PaymentDTO createPayment(PaymentDTO paymentDTO) {
        return null;
    }
}
