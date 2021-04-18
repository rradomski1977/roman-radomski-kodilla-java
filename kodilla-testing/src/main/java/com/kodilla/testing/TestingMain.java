package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 9;
        int b = 4;

        int add = calculator.getAdd();
        if (add == 13) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }

        int subtract = calculator.getSubtract();
        if (subtract == 5) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
    }
}