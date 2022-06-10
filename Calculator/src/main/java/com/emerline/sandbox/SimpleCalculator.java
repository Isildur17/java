package com.emerline.sandbox;

import java.math.BigDecimal;

public class SimpleCalculator {
    public static void main (String [] args) {
        CalculatorForActions calculation_results = new CalculatorForActions();
        double firstValue = calculation_results.getEnteredFirstValue();
        double secondValue = calculation_results.getEnteredSecondValue();
        String operator = calculation_results.getEnteredOperator();
        calculation_results.performCalculation(firstValue, secondValue, operator);
    }
}