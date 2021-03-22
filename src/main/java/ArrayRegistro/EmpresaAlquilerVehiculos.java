/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRegistro;

import java.util.Date;

public class EmpresaAlquilerVehiculos {
    
    public String cif, nombre, registro;
    public Date fecha = new Date();
    public Cliente[] hojaClien;
    public Vehiculo[] hojaVeh;
    public VehiculoAlquilado[] hojaVehAlq;
    public int totalClientes = 0;
    public int totalVehiculos  = 0;   
    public int totalAlquileres = 0;
    
    public EmpresaAlquilerVehiculos(Cliente[] hojaClie, Vehiculo[] hojaVeh, VehiculoAlquilado[] hojaVehAlq, int totalClientes, int totalAlquiler, int totalVehiculos) {
        this.hojaClien = new Cliente[this.totalClientes];
        this.hojaVeh = new Vehiculo[this.totalVehiculos];
        this.hojaVehAlq = new VehiculoAlquilado[this.totalAlquileres];
        
        this.totalClientes = totalClientes; 
        this.totalAlquileres = totalAlquileres;
        this.totalVehiculos = totalVehiculos;
    }

    public EmpresaAlquilerVehiculos(String cif, String nombre, String registro) {
        this.cif = cif;
        this.nombre = nombre;
        this.registro = registro;
    }
       
    public void registrarCliente(Cliente cliente, String nif, String nombre, String apellidos){
        this.hojaClien[this.totalClientes] = new Cliente(nif,nombre,apellidos);//cliente;
        this.totalClientes++;
    }
    
    public void registrarVehiculo(Vehiculo  vehiculo){
        this.hojaVeh[this.totalVehiculos] = vehiculo;    
        this.totalVehiculos++;
    }
    
    public void imprimirClientes(){
        
        System.out.println("NIF cliente\tNombre\n");    
        
        for (int i=0; i<this.totalClientes; i++)        
            System.out.println("Cliente {" + "Nif= " + hojaClien[i].getNif() +
                    " Nombre y Apellido = " + hojaClien[i].getNombre() + " " +
                    hojaClien[i].getApellidos());
        
    }
    
    public void imprimirVehiculos(){
    
        System.out.println("Matricula\tModelo" +"\tImporte Disponible\n");   
        for (int i=0; i<this.totalVehiculos; i++)      
            System.out.println("Vehiculo {" + "Matricula= " + hojaVeh[i].getMatricula()
            + " Modelo= " + hojaVeh[i].getModelo() + " Importe Disponible= " + 
                    hojaVeh[i].getTarifa()); 
    
    }
    
    private Cliente getCliente(String nif) { 
        for (int i=0; i<this.getTotalClientes(); i++){ 
            if (this.hojaClien[i].getNif() == nif)  
                return this.hojaClien[i];  
        }
        return null; 
    }
    
    private Vehiculo getVehiculo(String matricula) { 
        for (int i=0; i<this.getTotalClientes(); i++){ 
            if (this.hojaVeh[i].getMatricula().equals(matricula))  
                return this.hojaVeh[i];  
        }
        return null; 
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }
    
    public void alquilarVehiculo(String matricula, String nif, int diasRest) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        // busca el cliente con el NIF dado en el array 
        // clientes y el vehículo con la matrícula dada en el
        // array vehiculos, si el vehículo está disponible se    
        // alquila con la fecha actual, que se obtiene
        // ejecutando los métodos diaHoy(), mesHoy() y
        // añoHoy(), cuya declaración no se incluye
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);             //Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler
            this.hojaVehAlq[this.totalAlquileres]=new VehiculoAlquilado(cliente, vehiculo, fecha.getDay(), fecha.getMonth(), fecha.getYear(), diasRest); //
            this.totalAlquileres++;   
        }
    }
    
    public void recibirVehiculo(String matricula) {  
        // busca el vehículo con la matrícula dada en el 
        // array vehiculos y modifica su disponibilidad 
        // para que se pueda alquilar de nuevo 
        Vehiculo vehiculo = getVehiculo(matricula); 
        if (vehiculo != null)
            vehiculo.setDisponible(true); 
    }
    
}