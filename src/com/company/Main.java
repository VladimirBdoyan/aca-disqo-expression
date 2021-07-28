package com.company;

import com.company.service.ExpressionCalculate;

public class Main {

    public static void main(String[] args) {

        String expression = "5+8/4*2+3";
        System.out.println(ExpressionCalculate.evaluate(expression));
    }
}
