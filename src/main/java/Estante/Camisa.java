/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estante;

/**
 *Clase Camisa, que describe la marca, el color, la edicion especial y
 *si tiene dibujos o etiquetas.
 * 
 * 
 */
public class Camisa {
    private String nombre, color;
    private boolean especial, dibujos;

    /**
     * 
     * Constructor Camisa
     * 
     * Define los atributos que trae con el color y el nombre de la marca
     * como una camisa sin dibujos ni edicion especial.
     * 
     * @param nombre nombre del producto.
     * @param color  color del producto.
     */
    
    public Camisa(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.dibujos = false;
        this.especial = false;
    }

    /**
     * 
     * Retorna el nombre de la marca de la camisa.
     * 
     * @return la camisa de la marca especifica.
     * 
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * Retorna la camisa del color especifico.
     * 
     * @return camisa de color especifica.
     * 
     */    
    
    public String getColor() {
        return color;
    }
    
    /**
     * 
     * Retorna el valor de la edicion especial de la camisa.
     * 
     * @return la camisa de edicion especial.
     * 
     */
    
    public boolean isEspecial() {
        return especial;
    }

    /**
     * 
     * Retorna la condicion si tiene dibujos la camisa.
     * 
     * @return la revision de la camisa con o sin dibujos. 
     * 
     */
    
    public boolean isDibujos() {
        return dibujos;
    }
    
    /**
     * 
     * Cambia esa camisa de esa marca por otra, de otra marca.
     * 
     * @param nombre marca para cambiar la camisa.
     *
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * Cambia el color de esa camisa especifica.
     * 
     * @param color de la camisa especifica que quieres cambiar.
     * 
     */
    
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * 
     * Cambia la camisa por una de edicion limitada.
     * 
     * @param especial selecciona la camisa de edicion especial.
     * 
     */
    
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * 
     * Cambia la camisa por una que tiene etiquetas o dibujos.
     * 
     * @param dibujos camisa que tiene dibujos o etiquetas.
     * 
     */
    
    public void setDibujos(boolean dibujos) {
        this.dibujos = dibujos;
    }
    
}
