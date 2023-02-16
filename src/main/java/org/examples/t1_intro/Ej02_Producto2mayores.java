package org.examples.t1_intro;

import java.util.Scanner;

import static org.examples.matrices.OpsMatrices.generarArreglo;
import static org.examples.matrices.OpsMatrices.imprimeArreglo;

public class Ej02_Producto2mayores {

    public static void main(String[] args) {
        int n;
        int[] A;
        Scanner scanner = new Scanner(System.in);
        int producto;

        System.out.println("Indique el valor de n (>=2): ");
        n = scanner.nextInt();

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        producto = producto2mayores(A,n);

        System.out.println("El producto de los dos mayores es " + producto + ".");
    }

    //PRODUCTO DE LOS DOS MAYORES
    private static int producto2mayores(int[] A, int n) {
        int mayor1, mayor2;
        int i, resultado;

        if(A[0] > A[1]){
            mayor1 = A[0];
            mayor2 = A[1];
        }else {
            mayor1 = A[1];
            mayor2 = A[2];
        }

        i = 2;

        while ( i<n ){
            if( A[i] > mayor1 ){
                mayor2 = mayor1;
                mayor1 = A[i];
            } else if ( A[i] > mayor2 ){
                mayor2 = A[i];
            }
            i++;
        }

        resultado = mayor1 * mayor2;
        return resultado;
    }


}
