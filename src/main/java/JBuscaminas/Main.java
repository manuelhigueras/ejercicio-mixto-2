/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Buscaminas juego = new Buscaminas(4,4);
//        
//        juego.crearCampo();
//        juego.muestraCampo();
        
        Buscaminas2 juego = new Buscaminas2(4,4);
        juego.creaCampoX();
        juego.MuestraCampoX();

        
    }
    
}
