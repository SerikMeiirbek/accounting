package com.cydeo.controller;

import com.cydeo.dto.PaymentDTO;
import com.cydeo.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String getAllPayments(Model model){
        List<PaymentDTO> paymentList = paymentService.getAllPayments();
        model.addAttribute("payments",paymentList);

        return "payment";//??? not right mapping
    }
}
