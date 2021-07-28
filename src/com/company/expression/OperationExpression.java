//package com.company.expression;
//
//import com.company.operator.Operator;
//import org.graalvm.compiler.nodes.ArithmeticOperation;
//
///**
// * Created with IntelliJ IDEA.
// * User: Vladimir
// * Date: 27.07.2021.
// * Time: 21:28.
// */
//public class OperationExpression implements Expression {
//    Expression left;
//    Expression rigth;
//    Operator operator;
//
//    public OperationExpression(Operator operator) {
//        this.operator = operator;
//    }
//
//    public void setLeft(Expression left) {
//        this.left = left;
//    }
//
//    public void setRigth(Expression rigth) {
//        this.rigth = rigth;
//    }
//
//    @Override
//    public double calculate() {
//        return operator.evaluate(left.calculate(),rigth.calculate());
//
//    }
//}
