package org.examples.t2_recursivos;

import static org.examples.arreglos.OpsArreglos.generarArreglo;
import static org.examples.arreglos.OpsArreglos.imprimeArreglo;

public class Ej03_maximo {

    public static void main(String[] args) {
        int n = 15;
        int[] A = generarArreglo(n);
        int max;

        imprimeArreglo(A, n);

        max = maximo(A, 0, n-1);

        System.out.println("El máximo es: "+ max);
    }

    private static int maximo(int[] A, int ini, int fin) {
        int mitad;
        int max;
        int max_aux;

        if(ini == fin) {
            return A[ini];
        } else {
            mitad = (int)( (double)ini + (double) fin) / 2 ;
            max = maximo(A, ini, mitad);
            max_aux = maximo(A, mitad+1, fin);
            if( max_aux > max )
                return max_aux;
            else
                return max;
        }
    }
}
