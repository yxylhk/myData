package com.ioc.service.impl;

import com.ioc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s3")
public class CalculatorServiceImpl3 implements CalculatorService {
    @Override
    public double sum(double num1, double num2) {
        System.out.println("执行了乘法：");
        return num1*num2;
    }
}
