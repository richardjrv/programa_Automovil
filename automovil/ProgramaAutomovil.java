
package com.mycompany.programa.automovil;

public class ProgramaAutomovil {

    public static void main(String[] args) {
        System.out.println("PROGRAMA SOBRE UN AUTOMOVIL");
        Automovil objautomovil new Automovil("Ford"2018,3,Automovil.TipoCombustible.DIESEL,Automovil.TipoAutomovil.EJECUTIVO,5,6,250,Automovil.ColorAuto.NEGRO);
        objautomovil.imprimir();
        objautomovil.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + objautomovil.velocidadActual);
        objautomovil.acelerar(100);
        System.out.println("Velocidad actual = " + objautomovil.velocidadActual);
        objautomovil.desacelerar(50);
        System.out.println("Velocidad actual = " + objautomovil.velocidadActual);
        objautomovil.frenar();
        System.out.println("Velocidad actual = " + objautomovil.velocidadActual);
        objautomovil.desacelerar(20);
    }
}
