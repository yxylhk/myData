package com.ioc.service.impl;

import com.ioc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s4")
public class CalculatorServiceImpl4 implements CalculatorService {
    @Override
    public double sum(double num1, double num2) {
        System.out.println("执行了除法：");
        return num1/num2;
    }
}
