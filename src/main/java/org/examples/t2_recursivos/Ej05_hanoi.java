package org.examples.t2_recursivos;

public class Ej05_hanoi {
    public static void main(String[] args) {
        int numDiscos = 5;
        char izq = 'I';
        char cen = 'C';
        char der = 'D';
        String movimientos;
                                   //origen, destino, auxiliar
        movimientos = hanoi(numDiscos, izq, der, cen);

        System.out.println(movimientos);
    }

                                               //origen, destino, auxiliar
    private static String hanoi(int numDiscos, char izq, char der, char cen) {
        if(numDiscos==1) {
            return "Mover d" + numDiscos + " de " + izq + " a " + der +"\n";
        } else {                         //origen, destino, auxiliar
            return hanoi(numDiscos-1,izq, cen, der)
                    + "Mover d" + numDiscos + " de " + izq + " a " + der +"\n"
                    + hanoi(numDiscos-1, cen, der, izq);
                                              //origen, destino, auxiliar
        }
    }
}
