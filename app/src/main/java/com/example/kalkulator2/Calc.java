package com.example.kalkulator2;

public class Calc {

    public static double silnia(double a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * silnia(a - 1);
        }
    }

    public static double Count(Operations operacja, double num1,  double num2 ) {
        double result = 0;

        switch (operacja) {
            case plus:
                result = num1 + num2;
                break;
            case minus:
                result = num1 - num2;
                break;
            case multiply:
                result = num1 * num2;
                break;
            case divide:
                result = num1 / num2 ;
                break;
            case pow:
                result = Math.pow(num1 ,num2);
                break;
            case sqrt:
                result = Math.sqrt(num1);
                break;
            case silnia:
                result = silnia(num1);
        }

        return result;

    }
}
