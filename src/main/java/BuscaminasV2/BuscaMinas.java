package BuscaminasV2;

import java.util.Random;
public class BuscaMinas {
    
    //CONSTANTES
    private final int FILAS = 6;
    private final int COLUMNAS = 6;
    //ATRIBUTOS
    private int[][] panel;
    private int totalMinas = 3;
    private int minasDesactivadas = 0;
    
    //CONSTRUCTORES

    public BuscaMinas() {
    }
    
    //
    public void inicializarJuego(){
        //crear panel
        this.panel = new int[FILAS][COLUMNAS];
        //poner minas
        Random rdm = new Random();
        int contador  = 3;
        while(contador > 0){
            int f = rdm.nextInt(FILAS);
            int c = rdm.nextInt(COLUMNAS);
            if(panel[f][c] == 0){
                panel[f][c] = 1;
                contador --;
            }
        } 
    }//fin inicializarJuevo
    
    public boolean desactivarMina(int fila, int columna){
        boolean acerto = false;
        //verificar si estoy dentro tablero
        if( fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS ){
            if(panel[fila][columna] == 1){
                acerto = true;
                panel[fila][columna] = -1;
                minasDesactivadas ++;
                System.out.println(" Mina desactivada !!");
            }else if(panel[fila][columna] == -1){
                System.out.println(" Esta mina ya esta desactivada !!");
            }else{
                System.out.println(" Falló");
            }
        }else{
            System.out.println("... Error.  Estas fuera del tablero de " +
             FILAS + " X " + COLUMNAS);
        }
        return acerto;
    }
    
    public boolean esFinJuego(){
        return this.minasDesactivadas == this.totalMinas;
    }
    
    public void verPanel(){
        for(int[] filas: panel){
            for(int columna: filas){
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
    } 
    
    
}
