package org.examples.t1_intro;

import java.util.Scanner;

public class Ej06_examen1Preg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribir n: ");
        int n = scanner.nextInt();

        despliegaTriangulo(n);

    }


    //Despliega un tríangulo de "*"
    private static void despliegaTriangulo(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
