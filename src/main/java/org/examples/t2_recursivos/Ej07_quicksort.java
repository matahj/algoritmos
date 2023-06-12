package org.examples.t2_recursivos;

import static org.examples.arreglos.OpsArreglos.generarArreglo;
import static org.examples.arreglos.OpsArreglos.imprimeArreglo;

public class Ej07_quicksort {
    static private int[] A;
    public static void main(String[] args) {
        int n = 32;
        A = generarArreglo(n);
        imprimeArreglo(A,n);
        quickSort(0,n-1);
        imprimeArreglo(A,n);
    }

    private static void quickSort(int primero, int ultimo) {
        int pivote = A[primero];
        int i = primero;
        int j = ultimo;

        do{
            while ( A[i] < pivote ) i++;
            while ( A[j] > pivote ) j--;
            if(i<=j){
                int aux;
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }while (i <= j);

        if( primero < j )
            quickSort( primero, j );
        if( i < ultimo )
            quickSort( i, ultimo );
    }


}
