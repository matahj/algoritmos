package org.examples.t2_recursivos;

public class Ej04_hojas {
    public static void main(String[] args) {
        int h = 2; //altura del árbol
        int k = 2; //número de hijos de cada nodo

        int hojas = cuentaHojas(h,k);

        System.out.println("Un árbol de altura " + h + " y " + k + " hijos por nodo tiene " + hojas + " nodos hoja.");
    }

    private static int cuentaHojas(int h, int k) {
        int suma = 0;
        if(h==1){
            return k;
        }else {
            for(int i=0; i<k; i++){
                suma = suma + cuentaHojas(h-1,k);
            }
            return suma;
        }
    }
}
