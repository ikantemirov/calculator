package io.ikantemirov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalulatorInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine = reader.readLine();// read an expression
        double d1 = 0.0, d2 = 0.0;
        Calculator calculator = new Calculator();
        String operator = "";
        try {                                                                        // separate 2 numbers and operation sign
            nextLine = nextLine.trim();
            d1 = Double.parseDouble(calculator.cutFirstNumber(nextLine));
            nextLine = nextLine.substring(calculator.cutFirstNumber(nextLine).length()).trim();
            operator = nextLine.substring(0, 1);
            nextLine = nextLine.substring(1).trim();
            d2 = Double.parseDouble(calculator.cutFirstNumber(nextLine));
        }
        catch (StringIndexOutOfBoundsException e){
            System.err.println("Error");
        }
        catch (NumberFormatException e) {
            System.err.println("Error");
        }
        System.out.println(d1);
        System.out.println(operator);
        System.out.println(d2);
        char op = operator.charAt(0);
        switch (op) {
            case '+':
                System.out.println("Answer is: " + calculator.addition(d1, d2));
                break;
            case '-':
                System.out.println("Answer is: " + calculator.substraction(d1, d2));
                break;
            case '*':
                System.out.println("Answer is: " + calculator.multiplication(d1, d2));
                break;
            case '/':
                System.out.println("Answer is: " + calculator.division(d1, d2));
                break;
            default:
                System.out.println("Error");
        }
    }
}
