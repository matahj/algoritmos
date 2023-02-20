package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.matrices.OpsMatrices.generarArreglo;
import static org.examples.matrices.OpsMatrices.imprimeArreglo;

public class Ej03_BubbleSort {
    public static void main(String[] args) {
        int n;
        int[] A;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el valor de n: ");
        n = scanner.nextInt();

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
