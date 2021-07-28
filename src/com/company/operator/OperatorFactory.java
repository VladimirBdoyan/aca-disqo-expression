package com.company.operator;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 27.07.2021.
 * Time: 21:51.
 */
public class OperatorFactory {
    private  OperatorFactory(){

    }
    // By this method we can create new Operator instance;
    public static Operator createOperator(String str){

        switch (ArithmeticOperator.setOperator(str)){
            case ADD:
                return new Addition();
            case SUB:
                return new Subtraction();
            case MUL:
                return  new Multiplication();
            case DIV:
                return new Division();

            default:
                throw new IllegalArgumentException();
        }
    }
}
