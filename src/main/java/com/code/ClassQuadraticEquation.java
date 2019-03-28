package com.code;

public class ClassQuadraticEquation {
    double a,b,c;
    //constructor
    public ClassQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //method
    public String display(){
        return "Equation is: "+ this.a+"*x*x + "+this.b+"*x + "+this.c+ " = 0.";
    }

    public String displayRoots(){
        double detal = Math.pow(this.b,2) - 4*this.a*this.c;
        if (detal > 0.0){
            double x1 = (-this.b + Math.sqrt(detal))/(2 * this.a);
            double x2 = (-this.b - Math.sqrt(detal))/(2 * this.a);
            return "Equation has tow roots is: x1 = "+ x1 + ", x2 + "+ x2;
        }else if (detal == 0.0){
            return "Equation has one root is: x = "+ -this.b/(2 * this.a);
        }else {
            return "Equation has NOT real roots";
        }
    }
}
