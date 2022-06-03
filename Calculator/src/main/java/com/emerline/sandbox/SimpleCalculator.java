package com.emerline.sandbox;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String [] args) {
        CalculatorForActions calculation_results = new CalculatorForActions();
        Scanner scanner = new Scanner(System.in);
        Double first_value = calculation_results.getEnteredValue(scanner);
        Double second_value = calculation_results.getEnteredValue(scanner);
        String operator = calculation_results.getEnteredOperator(scanner);
        calculation_results.performCalculation(first_value, second_value, operator);
        scanner.close();
    }
}