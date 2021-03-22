package BuscaminasV2;

import java.util.Scanner;

public class PruebaJuego {
    public static void main(String[] args) {
        
        
        BuscaMinas juego = new BuscaMinas();
        juego.inicializarJuego();
        juego.verPanel();
        
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        while(!juego.esFinJuego()){
            System.out.println("Introduzca fila de 0 a 5:");
            fila = sc.nextInt();
            System.out.println("Introduzca columna de 0 a 5");
            columna = sc.nextInt();
            juego.desactivarMina(fila, columna);
            juego.verPanel();
        }
        System.out.println("... fin juego");
        
    }
}
