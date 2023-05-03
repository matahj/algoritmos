package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.arreglos.OpsArreglos.generarArreglo;
import static org.examples.arreglos.OpsArreglos.imprimeArreglo;

public class Ej08_elementosDistintos {
    public static void main(String[] args) {
        int n;
        int[] A;
        Scanner s = new Scanner(System.in);
        boolean distintos = true;

        System.out.print("Tamaño del arreglo: ");
        n = s.nextInt();

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        distintos = sonDistintos(A,n);

        if(distintos){
            System.out.println("No hay elementos repetidos");
        }else {
            System.out.println("Sí hay elementos repetidos");
        }

    }

    //ALGORITMO QUE INDICA SI TODOS LOS ELEMENTOS SON DISTINTOS
    private static boolean sonDistintos(int[] A, int n) {

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(A[i] == A[j]){
                    return false;
                }
            }
        }

        return true;
    }
}
