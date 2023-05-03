package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.matrices.OpsMatrices.*;

public class Ej05_matrixMulti {
    public static void main(String[] args) {
        int m,n;
        int[][] A, B, C;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique el número de filas: ");
        m = scanner.nextInt();

        System.out.print("Indique el número de columnas: ");
        n = scanner.nextInt();

        A = generarMtz(m,n);
        imprimeMtz(A,m,n);

        B = generarMtz(n,m);
        imprimeMtz(B,n,m);

        C = multiplicaMtz(A,B,m,n);
        imprimeMtz(C,m,m);
    }

    //ALGORITMO DE MULTIPLICACIÓN DE MATRICES mxn y nxm
    private static int[][] multiplicaMtz(int[][] A, int[][] B, int m, int n){
        int[][] C = new int[m][m];

        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                C[i][j] = 0;
                for (int k=0; k<n; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

}
