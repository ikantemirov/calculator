package io.ikantemirov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    public static String cutFirstNumber(String str) { // return substring cutted to operator
        String opers = "+-*/ ";
        str = str.trim();
        int i = 0;
        if (str.charAt(0) == '-');
            i = 1;
        while ((i < str.length() && (opers.indexOf(str.charAt(i)) == -1))) {
            i++;
        }
        return str.substring(0, i);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine = reader.readLine();// read an expression
        double d1 = 0.0, d2 = 0.0;
        String operator = "";
        try {                                                                        // separate 2 numbers and operation sign
            nextLine = nextLine.trim();
            d1 = Double.parseDouble(cutFirstNumber(nextLine));
            nextLine = nextLine.substring(cutFirstNumber(nextLine).length()).trim();
            operator = nextLine.substring(0, 1);
            nextLine = nextLine.substring(1).trim();
            d2 = Double.parseDouble(cutFirstNumber(nextLine));
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
                System.out.println("Answer is: " + (d1 + d2));
                break;
            case '-':
                System.out.println("Answer is: " + (d1 - d2));
                break;
            case '*':
                System.out.println("Answer is: " + (d1 * d2));
                break;
            case '/':
                System.out.println("Answer is: " + (d1 / d2));
                 break;
            default:
                System.out.println("Error");
        }
    }
}
