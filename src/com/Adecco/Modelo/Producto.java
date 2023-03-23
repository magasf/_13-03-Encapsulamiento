package com.Adecco.Modelo;

public class Producto {
    /*
    * 1. Atributos
    * 2. Metodos
    * 3. Constructores
    * 4. Setter y Getters
    * */

    //1. Atributos
    private int numProducto;
    private String nombreProducto;
    private double precio;
    private int cantidadExistencia;

    //Asignar valor al atributo
    public void setNumProducto(int numProducto){
        this.numProducto = numProducto;
    }

    public int getNumProducto(){
        return numProducto;
    }
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void  setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

}
