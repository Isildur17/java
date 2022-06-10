package com.emerline.sandbox;

import java.util.Scanner;

class CalculatorForActions implements Calculator {
    private double calculationResult;

    @Override
    public double getEnteredFirstValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GET_DOUBLE_FIRST_VALUE_EN);
        while (!scanner.hasNextDouble()) {
            System.out.println(GET_DOUBLE_FIRST_VALUE_EN);
            scanner.next();
        }
        return scanner.nextDouble();
    }
    @Override
    public double getEnteredSecondValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GET_DOUBLE_SECOND_VALUE_EN);
        while (!scanner.hasNextDouble()) {
            System.out.println(GET_DOUBLE_SECOND_VALUE_EN);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    @Override
    public String getEnteredOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CHOOSE_OPERATOR_EN);
        while (!scanner.hasNext(PATTERN)) {
            System.out.println(CHOOSE_OPERATOR_EN);
            scanner.next();
        }
        return scanner.next();
    }
    @Override
    public double multiplicationOperation(double value1, double value2) {
        return value1 * value2;
    }

    @Override
    public double additionOperation(double value1, double value2) {
        return value1 + value2;
    }

    @Override
    public double divisionOperation(double value1, double value2) {
        return value1 / value2;
    }

    @Override
    public double subtractionOperation(double value1, double value2) {
        return value1 - value2;
    }

    @Override
    public void performCalculation(double value1, double value2, String operation) {
        switch (operation) {
            case "+":
                calculationResult = additionOperation(value1, value2);
                break;
            case "-":
                calculationResult = subtractionOperation(value1, value2);
                break;
            case "*":
                calculationResult = multiplicationOperation(value1, value2);
                break;
            case "/":
                /*
                    Fixing of the division by zero defect that led to the Infinity result
                 */
                while (value2 == 0) {
                    System.out.println(ZERO_DIVIDER_EXCEPTION_EN);
                    value2 = this.getEnteredFirstValue();
                }
                calculationResult = divisionOperation(value1, value2);
                break;
        }
        System.out.println(CALCULATION_RESULTS_EN);
        System.out.println(value1 + " " + operation + " " + value2 + " = " + calculationResult);
    }
}
