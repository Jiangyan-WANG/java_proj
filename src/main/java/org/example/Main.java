package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.print("a+b=%d");
        System.out.println(Calculator.add(a,b));
        System.out.print("a-b=%d");
        System.out.println(Calculator.minus(a,b));
        System.out.print("a*b=%d");
        System.out.println(Calculator.multiple(a,b));
        System.out.print("a/b=%d");
        System.out.println(Calculator.divide(a,b));

    }

}