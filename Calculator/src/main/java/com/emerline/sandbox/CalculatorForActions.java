package com.emerline.sandbox;

import java.util.Scanner;

class CalculatorForActions extends Calculator {

    @Override
    public double getEnteredValue(Scanner scanner) {
        System.out.println(GET_DOUBLE_VALUE_EN);
        while (!scanner.hasNextDouble()) {
            System.out.println(GET_DOUBLE_VALUE_EN);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    @Override
    public String getEnteredOperator(Scanner scanner) {
        System.out.println(CHOOSE_OPERATOR_EN);
        while (!scanner.hasNext(PATTERN)) {
            System.out.println(CHOOSE_OPERATOR_EN);
            scanner.next();
        }
        return scanner.next();
    }

    @Override
    public void performCalculation(double value1, double value2, String operation) {
        switch (operation) {
            case "+":
                calculation_result = value1 + value2;
                break;
            case "-":
                calculation_result = value1 - value2;
                break;
            case "*":
                calculation_result = value1 * value2;
                break;
            case "/":
                calculation_result = value1 / value2;
                break;
        }
        System.out.println(CALCULATION_RESULTS_EN);
        System.out.println(value1 + " " + operation + " " + value2 + " = " + calculation_result);
    }
}
