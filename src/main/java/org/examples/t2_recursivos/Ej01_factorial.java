package org.examples.t2_recursivos;

public class Ej01_factorial {

    public static void main(String[] args) {
        long n = 10; //Maximó 20
        long res;

        res = factorial(n);

        System.out.println("Factorial de " + n + " = " + res);
    }

    private static long factorial(long n) {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
