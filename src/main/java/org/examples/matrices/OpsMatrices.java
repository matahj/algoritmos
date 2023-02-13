package org.examples.matrices;

public class OpsMatrices {

    public static int[] generarArreglo(int n) {
        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = (int)Math.floor(Math.random()*100);
        }
        return A;
    }

    public static void imprimeArreglo(int[] A, int n) {
        for(int i=0; i<n; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.println(" ");
    }
}
