package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.matrices.OpsMatrices.generarArreglo;
import static org.examples.matrices.OpsMatrices.imprimeArreglo;

public class Ej04_insertionSort {
    public static void main(String[] args) {
        int n;
        int[] A;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el valor de n: ");
        n = scanner.nextInt();

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        insertionSort(A,n);

        imprimeArreglo(A,n);
    }

    //ALGORITMO INSERTION SORT
    private static void insertionSort(int[] A, int n) {
        int i, j, temp;
        boolean posCorrecta;

        for( i = 1; i<n; i++ ){
            temp = A[i];
            j = i - 1;
            posCorrecta = false;

            while ( j>=0 && (!posCorrecta) ){
                if( A[j] > temp ){
                    A[j+1] = A[j];
                    j--;
                } else {
                    posCorrecta = true;
                }
            }
            A[j+1] = temp;
        }
    }
}
