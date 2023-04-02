package fon.master;

import fon.master.calculator.CalculatorUtil;
import fon.master.drawing.DrawingUtil;

public class Main {
    public static void main(String[] args) {
        CalculatorUtil calculatorUtil = new CalculatorUtil(10,2);
        System.out.println("Sabiranje: " + calculatorUtil.addition());
        System.out.println("Oduzimanje: " + calculatorUtil.subtraction());
        System.out.println("Mnozenje: " + calculatorUtil.multiplication());
        System.out.println("Deljenje: " + calculatorUtil.division());

        System.out.println("------------------------------------------");

        DrawingUtil drawingUtil = new DrawingUtil();
        drawingUtil.piramidaZvezdica(10);
        drawingUtil.obrnutaXpiramida(10);
    }
}