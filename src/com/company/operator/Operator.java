package com.company.operator;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 27.07.2021.
 * Time: 21:31.
 */
public abstract class Operator {
   public abstract double evaluate(double x, double y);

    public enum ArithmeticOperator{
        ADD("+"),
        SUB("-");

        private String value;

        ArithmeticOperator(String value) {
            this.value = value;
        }
    }
}
