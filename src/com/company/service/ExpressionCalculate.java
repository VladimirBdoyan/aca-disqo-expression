package com.company.service;

import com.company.expression.Expression;
import com.company.expression.ValueExpression;
import com.company.expression.OperationExpression;
import com.company.operator.ArithmeticOperator;
import com.company.operator.Operator;
import com.company.operator.OperatorFactory;

public class ExpressionCalculate {
    public static double evaluate(String mathExpression) {
        Expression main = expressionTree(mathExpression);
        return main.calculate();
    }

    private static Expression expressionTree(String mathExpression) {

        OperationExpression operatorExpression;
        Operator operator;
        int index;
        String operationType;
        String left;
        String right;
        Expression leftSide;
        Expression rightSide;

//        es masy petqa verapoxem vor pakagcerov el ashxati
        index = Math.max(mathExpression.lastIndexOf(ArithmeticOperator.OPENPARENTHESES.getValue()), mathExpression.lastIndexOf(ArithmeticOperator.CLOSEPARENTHESES.getValue()));


        if (index < 0) {
            index = Math.max(mathExpression.lastIndexOf(ArithmeticOperator.ADD.getValue()), mathExpression.lastIndexOf(ArithmeticOperator.SUB.getValue()));
            if (index < 0) {
                index = Math.max(mathExpression.lastIndexOf(ArithmeticOperator.MUL.getValue()), mathExpression.lastIndexOf(ArithmeticOperator.DIV.getValue()));
//                index = Math.abs(mathExpression.lastIndexOf(ArithmeticOperator.OPENPARENTHESES.getValue()));
                if (index < 0) {
                    return new ValueExpression(Double.valueOf(mathExpression));
                }
            }
        }
        operationType = mathExpression.substring(index, index + 1);
        operator = OperatorFactory.createOperator(operationType);
        operatorExpression = new OperationExpression(operator);

        left = mathExpression.substring(0, index);
        right = mathExpression.substring(index + 1);

        leftSide = expressionTree(left);
        rightSide = expressionTree(right);
        operatorExpression.setLeft(leftSide);
        operatorExpression.setRight(rightSide);

        return operatorExpression;
    }

}
