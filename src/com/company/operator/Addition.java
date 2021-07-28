package com.company.operator;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 27.07.2021.
 * Time: 21:48.
 */
public class Addition extends Operator {
    @Override
   public double evaluate(double x, double y) {
        return x + y;
    }
}
