package com.mycompany.programa.automovil;

public class ProgramaAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil(
            "Toyota", 
            2022, 
            1800,
            Automovil.TipoCombustible.GASOLINA,
            Automovil.TipoAutomovil.CIUDAD,
            4, 
            5, 
            180, 
            Automovil.ColorAuto.ROJO
        );

        auto.acelerar(60);
        auto.imprimir();

        double tiempo = auto.calcularTiempoLlegada(120);
        if (tiempo != -1) {
            System.out.println("Tiempo estimado de llegada: " + tiempo + " horas");
        }
    }
}
