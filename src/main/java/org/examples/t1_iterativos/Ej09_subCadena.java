package org.examples.t1_iterativos;

import java.util.Scanner;

public class Ej09_subCadena {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Texto: ");
        char[] texto = scanner.nextLine().toCharArray();
        System.out.print("Patron: ");
        char[] patron = scanner.nextLine().toCharArray();*/

        char[] texto = "cerounodostrescuatrocincoseissieteochonuevediez".toCharArray();
        char[] patron = "diez".toCharArray();

        int m = texto.length;
        int n = patron.length;

        int indice = buscarPatron(texto, m, patron, n);

        System.out.println(texto);
        System.out.println(patron);
        System.out.println("Indice: " + indice);
    }

    //Busca un "patrón" en "texto"
    private static int buscarPatron(char[] texto, int m, char[] patron, int n) {
        int k=0;

        for(int i=0; i<m-n+1; i++){
            k=0;
            for(int j=i; j<i+n; j++){
                if(texto[j] != patron[k]){
                    break;
                }else {
                    k++;
                }
                if(j==i+n-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
