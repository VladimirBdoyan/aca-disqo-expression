package com.company.expression;

import com.company.operator.Operator;
/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 27.07.2021.
 * Time: 21:28.
 */
public class OperationExpression implements Expression {
    // We must create data like Tree type is Expression , where the Node is Arithmetic Operation
    // and its have two child right and left how can calculate each other by their node's Arithmetic Operation
    Expression left;
    Expression right;
    Operator operator;

    public OperationExpression(Operator operator) {
        this.operator = operator;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public double calculate() {
        return operator.evaluate(left.calculate(), right.calculate());

    }
}
