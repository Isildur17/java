package com.emerline.sandbox;

import java.util.Scanner;

public abstract class Calculator {

    protected double calculation_result;
    static String GET_DOUBLE_VALUE_EN = "Enter a decimal with a dot separator";
    static String CHOOSE_OPERATOR_EN = "Select operator: \n + \n - \n * \n /";
    static String PATTERN = "[|/+*-]";
    static String CALCULATION_RESULTS_EN ="The results of calculation is:";

    public abstract double getEnteredValue(Scanner scanner);
    public abstract String getEnteredOperator (Scanner scanner);
    public abstract void performCalculation(double value1, double value2, String operation);
}

