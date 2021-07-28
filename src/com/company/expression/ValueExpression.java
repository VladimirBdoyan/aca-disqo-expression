package com.company.expression;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 27.07.2021.
 * Time: 21:27.
 */
public class ValueExpression implements Expression {
    private double value;

    public ValueExpression(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
    return value;
    }
}
