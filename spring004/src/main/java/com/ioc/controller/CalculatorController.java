package com.ioc.controller;

import com.ioc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
    private CalculatorService calculatorService;

    @Autowired
    @Qualifier("s4")
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double sum(double n1,double n2){
        return calculatorService.sum(n1,n2);
    }
}
