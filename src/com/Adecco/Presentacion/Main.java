package com.Adecco.Presentacion;

import com.Adecco.Modelo.Producto;

public class Main {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setNumProducto(1);
        System.out.println("IdProducto --> " + p1.getNumProducto());
        p1.setNombreProducto("Raton inalambrico");
        System.out.println("Nombre producto --> " + p1.getNombreProducto());
        p1.setPrecio(5000);
        System.out.println("El precio es --> " +  p1.getPrecio());
        p1.setCantidadExistencia(15);
        System.out.println("Cantidad en existencia --> " + p1.getCantidadExistencia());

    }
}