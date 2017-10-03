package io.ikantemirov;


public class Calculator {
    public String cutFirstNumber(String str) { // return substring cutted to operator
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
    public double addition(double d1, double d2) {
        return d1 + d2;
    }
    public double substraction(double d1, double d2) {
        return d1 - d2;
    }
    public double multiplication(double d1, double d2) {
        return d1 * d2;
    }
    public double division(double d1, double d2) {
        return d1 / d2;
    }




}
