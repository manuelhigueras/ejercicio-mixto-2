/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

public class Buscaminas {
   
    int Xpos, Ypos;
    int[][] mapa;
    
    public Buscaminas(int Xpos, int Ypos){
        this.Xpos = Xpos;
        this.Ypos = Ypos;
        this.mapa= new int[Xpos][Ypos];

    }
    
    //public void inicializarJuego
    
    public void crearCampo(){
        
        for(int cont=0; cont < this.Xpos; cont++){
            for(int cont2=0; cont2 < this.Ypos; cont2++){
                    this.mapa[cont][cont2] = 0;
            }
        }
        
    }
    
    public void muestraCampo(){
        
    }
    
//    public void verPanel(){
//        
//    }
    
//    public boolean desactivar(int fila, int columna){
//        return null;
//    }
//    
//    public boolean IsFinJuego(){
//        return null;
//    }
    
}
