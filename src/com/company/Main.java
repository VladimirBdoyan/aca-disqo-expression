package com.company;

import com.company.service.ExpressionCalculate;

public class Main {

    public static void main(String[] args) {

        String a = "(5+7)/4*2";
        System.out.println(ExpressionCalculate.evaluate(a));
    }
}
