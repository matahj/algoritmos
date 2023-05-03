package org.examples.matrices;

public class OpsArreglos {

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

    public static void imprimeMtz(int[][] A, int m, int n) {
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] generarMtz(int m, int n) {
        int[][] A = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                A[i][j] = (int)Math.floor(Math.random()*10);
            }
        }

        return A;
    }
}
