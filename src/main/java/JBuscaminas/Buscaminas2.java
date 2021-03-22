/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

public class Buscaminas2 {
    int[] Xpos, Ypos;
    int x, y;

    public Buscaminas2(int x, int y) {
        this.Xpos = new int[x];
        this.Ypos = new int[y];
    }
    
    public boolean isNull(){
        if(Xpos[x] == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int[] creaCampoX(){
        for(int cont=0; cont < this.x; cont++){
            this.Xpos[cont] = 0;
        }
        return Xpos;
    }
    
    public void MuestraCampoX(){
        for(int cont=0; cont < this.x; cont++){
            System.out.print(this.Xpos[cont]);
        }
    }
    
    
}
