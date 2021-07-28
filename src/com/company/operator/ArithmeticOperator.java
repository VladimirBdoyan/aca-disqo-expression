package com.company.operator;

public enum ArithmeticOperator {
    ADD("+"),
    SUB("-");


    private final String value;

    ArithmeticOperator(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ArithmeticOperator setOperator(String str) {
        for(ArithmeticOperator operation: ArithmeticOperator.values()){
            if (operation.value.equals(str)) {
                return operation;
            }
        }
         throw new IllegalArgumentException();
    }

}