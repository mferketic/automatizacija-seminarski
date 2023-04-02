package fon.master;

import fon.master.calculator.CalculatorUtil;

public class Main {
    public static void main(String[] args) {
        CalculatorUtil calculatorUtil = new CalculatorUtil(10,2);
        System.out.println("Sabiranje: " + calculatorUtil.addition());
        System.out.println("Oduzimanje: " + calculatorUtil.subtraction());
        System.out.println("Mnozenje: " + calculatorUtil.multiplication());
        System.out.println("Deljenje: " + calculatorUtil.division());
    }
}