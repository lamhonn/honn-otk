package fi.vy.lamh;

import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("2 plus 3 on" + add(2,3));
        System.out.println("1 is divided by 0 is on " + divide(1,0));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    /*Function get two doubles as arguments and
    *  return the division of them in two decimals. 
    * if denominator is zero return NaN*/

    public static double divide(double a, double b) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(a / b).replace(",", ".")).doubleValue();
    }

    public static String returnTwoChars(String input) {
        return input.substring(0,1);
    }

    public static Double div(double a, double b) {
        return a/b;
    }
}
