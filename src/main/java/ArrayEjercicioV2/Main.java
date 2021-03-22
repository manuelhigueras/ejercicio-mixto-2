/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayEjercicioV2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array d = new Array();
        Point[] figura = d.crearArray();
        
        //1. mostrar los datos del punto en la ultima posicion
        Point ultimo = figura[figura.length-1];
        System.out.println("Ultimo valor={"+ultimo.getX()+","+ultimo.getY()+"}");
        //2. cambiar la coordenadas x a valor 8 y 9 del punto de la 5ta posicion
        figura[4].setX(89);
        //3. recorrer array y mostrar todos los puntos
        for(int cont = 0; cont <= 9; cont++){
            System.out.println("Array={"+figura[cont]+"}");
        }
        //4. Decir en que posicion hay un punto con valores x=6 e y=7
        for(int cont=0; cont < figura.length; cont++){
            int value = figura[cont].getX();
            if(value == 6){
                System.out.println("El valor esta en la posicion = " + cont);
                break;
            }
            else{
                System.out.println("N/E");
            }
        }
        //5. Bucle mejorado
        for (Point aux : figura) {
            System.out.println("Valor del bucle mejorado = " + aux);
        }
        
    }
 
}   