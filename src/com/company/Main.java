package com.company;

import com.company.service.ExpressionCalculate;

public class Main {

    public static void main(String[] args) {

        String a = "5+6-7+4";
        System.out.println(ExpressionCalculate.evaluate(a));
    }
}
