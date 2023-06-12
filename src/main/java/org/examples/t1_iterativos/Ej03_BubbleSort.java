package org.examples.t1_iterativos;

import java.util.Scanner;

import static org.examples.arreglos.OpsArreglos.generarArreglo;
import static org.examples.arreglos.OpsArreglos.imprimeArreglo;

public class Ej03_BubbleSort {
    public static void main(String[] args) {
        int n = 20;
        int[] A;

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        bubbleSort(A,n);

        imprimeArreglo(A,n);
    }

    //ALGORITMO BUBLLESORT
    private static void bubbleSort(int[] A, int n) {
        int aux;

        for(int i = n-1; i>0; i--){
            for(int j=1; j < i; j++){
                if(A[j-1] > A[j]){
                    aux = A[j-1];
                    A[j-1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
