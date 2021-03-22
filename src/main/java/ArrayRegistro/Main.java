/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRegistro;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive", "www.easydrive.com");
        
        Cliente a = new Cliente("X5618927C","Juan","González López");
        //Cliente b = new Cliente("Z7568991Y","Luis", "Fernández Gómez");
        
        easydrive.registrarCliente(a, "X5618927C","Juan","González López");
        //easydrive.registrarCliente(b);
       
//        Vehiculo v1 = new Vehiculo("4060 TUR", "Skoda","Fabia", "Blanco", 90.0, false);
//        Vehiculo v2 = new Vehiculo("4070 DEP", "Ford","Mustang", "Rojo", 150.0, false);
//        Vehiculo v3 = new Vehiculo("4080 TUR", "VW", "GTI", "Azul", 110.0, false);
//        Vehiculo v4 = new Vehiculo("4090 TUR", "SEAT","Ibiza", "Blanco", 90.0, false);
//        Vehiculo v5 = new Vehiculo("4100 FUR", "Fiat","Ducato", "Azul", 80.0, false);
//        
//        easydrive.registrarVehiculo(v1);
//        easydrive.registrarVehiculo(v2);   
//        easydrive.registrarVehiculo(v3); 
//        easydrive.registrarVehiculo(v4);
//        easydrive.registrarVehiculo(v5);
        
        easydrive.imprimirClientes();
        
        
    }
    
}
    