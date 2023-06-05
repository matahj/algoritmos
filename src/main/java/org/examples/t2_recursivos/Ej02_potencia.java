package org.examples.t2_recursivos;

public class Ej02_potencia {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        int resultado;

        resultado = potencia(base, exponente);

        System.out.println(base + "^" + exponente + " = " + resultado);
    }

    private static int potencia(int base, int exponente) {
        if(exponente == 1)
            return base;
        else
            return base * potencia(base, exponente - 1);
    }
}
