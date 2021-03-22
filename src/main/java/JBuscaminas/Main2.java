/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int FILAS = 6;
        final int COLUMNAS = 6;
        int[][] panel = new int[FILAS][COLUMNAS];
        
        int minasColocadas = 0;
        Random rd = new Random();
        
        while(minasColocadas < 3){
            int f = rd.nextInt(FILAS); //aleatoriamente entrega un numero de 0 a 5
            int c = rd.nextInt(COLUMNAS);//aleatoriamente entrega un numero de 0 a 5
            if(panel[f][c] == 0){
                //No hay ya una mina
                panel[f][c] = 1;
                minasColocadas++;
            }
        }
        
        for(int[] f: panel){
            for(int c: f) {
                System.out.print(c + " ");
                System.out.println();
            }
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce fila: ");
        int fila = sc.nextInt();
        
        System.out.println("Introduce comuna: ");
        int columna = sc.nextInt();
        
        if(panel[fila][columna] == 1){
            System.out.println("Acerto");
        }
        else{
            System.out.println("Fallo");
        }
        
    }
    
}
