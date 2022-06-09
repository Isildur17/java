package com.emerline.sandbox;

public interface Calculator {
    String GET_DOUBLE_SECOND_VALUE_EN = "Enter the first value. The decimal value should have a dot separator";
    String GET_DOUBLE_FIRST_VALUE_EN = "Enter the second value. The decimal value should have a dot separator";
    String CHOOSE_OPERATOR_EN = "Select operator: \n + \n - \n * \n /";
    String PATTERN = "[|/+*-]";
    String CALCULATION_RESULTS_EN = "The results of calculation is:";
    String ZERO_DIVIDER_EXCEPTION_EN = "You can't divide by zero. Please enter a second number other than zero";
    double getEnteredFirstValue();
    double getEnteredSecondValue();
    String getEnteredOperator ();
    void performCalculation(double value1, double value2, String operation);
    double multiplicationOperation(double value1, double value2);
    double additionOperation(double value1, double value2);
    double divisionOperation(double value1, double value2);
    double subtractionOperation(double value1, double value2);
}

