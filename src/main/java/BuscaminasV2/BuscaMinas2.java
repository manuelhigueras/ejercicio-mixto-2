
package BuscaminasV2;

import java.util.Random;
import java.util.Scanner;


public class BuscaMinas2 {
    
    public static void main(String[] args) {
        
        // crear panel
        final int FILAS = 6;
        final int COLUMNAS = 6;
        int[][] panel = new int[FILAS][COLUMNAS];
        
        //mostra panel  - todo a cero
        for(int[] f: panel){
            for(int c: f){
                System.out.print(c + " ");
            }
            System.out.println();
        }
        
        // poner 3 minas
        int minasColocadas = 0;
        Random rd = new Random();
        while (minasColocadas < 3){
            int f = rd.nextInt(FILAS); // aleoatoriamente entrega un numero de 0 a 5
            int c = rd.nextInt(COLUMNAS);// aleoatoriamente entrega un numero de 0 a 5
            //comprobar si ya esta esta posición ocupada por una mina
            if(panel[f][c] == 0){
                //no hay ya una mina
                panel[f][c] = 1;
                minasColocadas++;
            }
        }//fin poner minas 
        //mostrar panel   - con minas
        for(int[] f: panel){for(int c: f){ System.out.print(c + " ");}System.out.println();}
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" introduce fila: ");
        int fila = sc.nextInt();
        
        System.out.println(" introduce comuna: ");
        int columna = sc.nextInt();
        
        if(panel[fila][columna] == 1){
            System.out.println("Acertó ");
        }else{
            System.out.println("Falló");
        }
        
    }//fin main
    
}
