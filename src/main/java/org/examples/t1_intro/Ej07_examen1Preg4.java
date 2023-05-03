package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.matrices.OpsArreglos.generarArreglo;
import static org.examples.matrices.OpsArreglos.imprimeArreglo;

public class Ej07_examen1Preg4 {
    public static void main(String[] args) {
        int n;
        int[] A;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique el valor de n: ");
        n = scanner.nextInt();

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        algoritmo(A,n);
    }

    //Encuentra el menor n1 y el mayor n2 y
    //cuántas veces aparecen c1 y c2
    private static void algoritmo(int[] A, int n) {
        int n1 = A[0];
        int c1 = 1;
        int n2 = A[0];
        int c2 = 1;

        for(int i=1; i<n; i++){
            if( A[i] < n1 ){
                n1 = A[i];
                c1 = 1;
            } else {
                if(A[i] == n1){
                    c1++;
                }
            }

            if(A[i]>n2){
                n2 = A[i];
                c2 = 1;
            } else {
                if(A[i]==n2){
                    c2++;
                }
            }
        }
        System.out.println("n1 = " + n1 +", c1 = " + c1);
        System.out.println("n2 = " + n2 +", c2 = " + c2);
    }

}
