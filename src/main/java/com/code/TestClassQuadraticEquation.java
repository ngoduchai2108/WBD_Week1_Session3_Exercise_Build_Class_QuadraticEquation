package com.code;

import java.util.Scanner;

public class TestClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter a,b,c
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        //show
        ClassQuadraticEquation equation = new ClassQuadraticEquation(a,b,c);
        System.out.println(equation.display());
        System.out.println(equation.displayRoots());
    }
}
