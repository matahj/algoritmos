package org.examples.t2_recursivos;

import static org.examples.arreglos.OpsArreglos.generarArreglo;
import static org.examples.arreglos.OpsArreglos.imprimeArreglo;

public class Ej06_mergesort {

    static private int[] A;
    static private int[] B;
    public static void main(String[] args) {
        int n = 25;
        A = generarArreglo(n);
        B = new int[n];

        imprimeArreglo(A, n);
        mergeSort(0,n-1);
        imprimeArreglo(B, n);
    }

    private static void mergeSort(int ini, int fin) {
        int mitad;
        if(ini<fin){
            mitad = (ini+fin)/2;
            mergeSort(ini, mitad);
            mergeSort(mitad+1,fin);
            intercala(ini,mitad,fin);
        }
    }

    private static void intercala(int ini, int mitad, int fin) {
        int iniB = ini;
        int finB = mitad+1;
        int k=ini;

        while ( iniB<=mitad && finB<=fin ){
            if(A[iniB]<A[finB]){
                B[k++] = A[iniB++];
            } else {
                B[k++] = A[finB++];
            }
        }

        while (iniB<=mitad){
            B[k++] = A[iniB++];
        }

        while (finB<=fin){
            B[k++] = A[finB++];
        }

        for (int i = ini; i <= fin; i++) {
            A[i] = B[i];
        }
    }

}
