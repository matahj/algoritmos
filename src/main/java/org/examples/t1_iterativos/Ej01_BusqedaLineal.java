package org.examples.t1_iterativos;

import java.util.Scanner;

import static org.examples.arreglos.OpsArreglos.*;

public class Ej01_BusqedaLineal {

    public static void main(String[] args) {
        int n, v;
        int[] A;
        Scanner scanner = new Scanner(System.in);
        int indice;

        System.out.println("Indique el tamaño del arreglo (n): ");
        n = scanner.nextInt();

        System.out.println("Indique el valor a buscar (v): ");
        v = scanner.nextInt();

        A = generarArreglo(n);
        imprimeArreglo(A,n);

        indice = busquedaLineal(v, A, n);

        if(indice<n){
            System.out.println("Valor " + v + " encontrado en el índice " + indice + ".");
        }else {
            System.out.println("Valor " + v + " no encontrado.");
        }
    }

    //BUSQUEDA LINEAL
    private static int busquedaLineal(int v, int[] A, int n) {
        int indice;

        for(indice=0; indice<n; indice++){
            if(A[indice]==v){
                return indice;
            }
        }
        return indice;
    }

}
