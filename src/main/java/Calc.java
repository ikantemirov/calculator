import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calc {
    public static double adds(double a, double b) {
        return a + b;
    }

    public static double subs(double a, double b) {
        return a - b;
    }

    public static double mults(double a, double b) {
        return a * b;
    }

    public static double divs(double a, double b) {
        return a / b;
    }
    public static String cutFirstNumber(String str) { // вырезает из строки первое число c минусом
        String mas = "1234567890";
        int i = 0;
        if (str.compareTo("") != 0) {
            char c = str.charAt(0);
            if (c == '-') {
                c = str.charAt(1);
                i = 1;
            }
            for (int j = 0; (mas.indexOf(c) != -1) && (i + 1 < str.length()); j++) {
                c = str.charAt(++i);
            }
            str = str.substring(0, i + 1);

            if (str.endsWith("1") ||
                    str.endsWith("2") ||
                    str.endsWith("3") ||
                    str.endsWith("4") ||
                    str.endsWith("5") ||
                    str.endsWith("6") ||
                    str.endsWith("7") ||
                    str.endsWith("8") ||
                    str.endsWith("9") ||
                    str.endsWith("0"))
                return str;
            else if (str.charAt(0) == '-' && str.length() == 2)
                return "";
            else return str.substring(0, str.length() - 1);
        }
        else return "";
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextLine = reader.readLine();// прочитали введенное выражение

        nextLine = nextLine.trim();

        String str1 = cutFirstNumber(nextLine);
        nextLine = nextLine.substring(str1.length(), nextLine.length());// разделили строку на первое число и остальное

        if (nextLine.charAt(0) == '.') {
            nextLine = nextLine.substring(1, nextLine.length());
            str1 = str1 + "." + cutFirstNumber(nextLine);
            nextLine = nextLine.substring(cutFirstNumber(nextLine).length(), nextLine.length());// добавили хвост если double
        }

        nextLine = nextLine.trim();

        char calcOperator = nextLine.charAt(0);
        nextLine = nextLine.substring(1, nextLine.length()); //отрезали оператор

        nextLine = nextLine.trim();

        String str2 = cutFirstNumber(nextLine);
        nextLine = nextLine.substring(str2.length(), nextLine.length());// разделили строку еще на одно число и остальное

        if  (nextLine.compareTo("") != 0 && nextLine.charAt(0) == '.') {
            nextLine = nextLine.substring(1, nextLine.length());
            str2 = str2 + "." + cutFirstNumber(nextLine);
            nextLine = nextLine.substring(cutFirstNumber(nextLine).length(), nextLine.length());// добавили хвост если double
        }

        nextLine = nextLine.trim();
        Double d1 = 0.0, d2 = 0.0;
         if (nextLine.compareTo("") != 0)
             System.out.println("Ошибка");
         else {
             try {
                 d1 = Double.parseDouble(str1);
                 d2 = Double.parseDouble(str2);
             } catch (NumberFormatException e) {
                 System.err.println("Ошибка");
             }
             if (calcOperator == '+')
                 System.out.println(adds(d1,d2));
             else if (calcOperator == '-')
                 System.out.println(subs(d1,d2));
             else if (calcOperator == '*')
                 System.out.println(mults(d1,d2));
             else if (calcOperator == '/')
                 System.out.println(divs(d1,d2));
             else System.out.println("Ошибка");
         }


    }
}
