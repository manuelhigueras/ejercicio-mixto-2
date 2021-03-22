/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayEjercicioV2;

public class Array {
    
    private int pos = 0;
    Point[] p;
    
    public Point[] crearArray(){
        p = new Point[10];
        for(int i=0; i<10; i++){
            p[i] = new Point(i,i+1);
        }
        return p;
    }
    
    public Point[] crearArrayGen(int pos){
        Point[] p;
        p = new Point[pos];
        for(int cont=0; cont < pos; cont++){
            p[cont] = new Point(cont,pos+1);
        }
        return p;
    }
    
    public Point[] crearArrayGenUnico(int tam, int valor){
        Point[] p;
        p = new Point[tam];
        p[this.pos] = new Point(valor, 0);
        return p;
    }
    
}
