package com.company.operator;

public class Division extends Operator{
    @Override
    public double evaluate(double x, double y) {
        return x / y;
    }
}
