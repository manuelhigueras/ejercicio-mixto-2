/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estante;

import Array_Ejercicio.Punto;

public class Ropero {
    private int num_perchas;
    private int num_perchas2 = 0;
    private Camisa[] cam_verano;

    public Ropero(int num_perchas){ 
        this.cam_verano = new Camisa[num_perchas];
        this.num_perchas = num_perchas;
    }
    
    public int getNum_perchas() {
        return num_perchas;
    }
    
    public Camisa[] crearPercha(String cam_guindar, String color_cam){
        for(int cont=0; cont<this.num_perchas; cont++){
            this.cam_verano[cont] = new Camisa(cam_guindar, color_cam);
        }
        return this.cam_verano;
    }
    
//    public void crearPerchaV2(int num, String cam_guindar, String color_cam){
//        for(int cont=0; cont<this.num_perchas; cont++){
//            if(cont == num)
//                this.cam_verano[this.num_perchas] = new Camisa(cam_guindar, color_cam);
//            else
//                this.cam_verano[this.num_perchas] = new Camisa("", "");
//        }
//        //return this.cam_verano;
    //}
    
    public void cuentaPercha(){
        for(int cont=0; cont<this.num_perchas; cont++){
            System.out.println("Ropero{" + "Camisas guindadas=" + this.cam_verano[cont] + '}');
        }
    }
    
    public void cuentaColorCamisa(){
        for(int cont=0; cont < this.num_perchas; cont++){
            System.out.println("Ropero{" + 
                    "Camisas guindadas=" + cont + 
                    "Color de camisas= " + cam_verano[cont].getColor() + '}');
        }
    }
    
    public void cuentaCamisa(){
        int num_perchas = getNum_perchas();
        for(int cont=0; cont < num_perchas; cont++){
            System.out.println("Ropero{" + 
                    "Numero de la percha=" + cont + 
                    ", Color de camisas= " + cam_verano[cont].getColor() + 
                    ", Tiene dibujo la camisa= " + cam_verano[cont].isDibujos() +
                    ", Edicion especial la camisa= " + cam_verano[cont].isEspecial() + 
            '}');
        }
    }
    
    public void cambiaCamisaDePerchaEspecifica(int percha_especifica, String marca, String color, boolean edicionEsp, boolean conDibujos){
        this.cam_verano[percha_especifica].setNombre(marca);
        this.cam_verano[percha_especifica].setColor(color);
        this.cam_verano[percha_especifica].setDibujos(conDibujos);
        this.cam_verano[percha_especifica].setEspecial(edicionEsp);
    }
    
}
