
package com.mycompany.programa.automovil;

public class Automovil {
//atributos

    private String marca;
    private int modelo;
    private int motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private ColorAuto color;
    private int velocidadActual = 0;
    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum ColorAuto {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }
//constructor
public Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible,TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,int velocidadMaxima, ColorAuto color) {
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomovil = tipoAutomovil;
    this.numeroPuertas = numeroPuertas;
    this.cantidadAsientos = cantidadAsientos;
    this.velocidadMaxima = velocidadMaxima;
    this.color = color;
    }
//metodos get y set en la clase automovil
//metodo get
public String getMarca() { return marca; }
public int getModelo() { return modelo; }
public int getMotor() { return motor; }
public TipoCombustible getTipoCombustible() { return tipoCombustible; }
public TipoAutomovil getTipoAutomovil() { return tipoAutomovil; }
public int getNumeroPuertas() { return numeroPuertas; }
public int getCantidadAsientos() { return cantidadAsientos; }
public int getVelocidadMaxima() { return velocidadMaxima; }
public ColorAuto getColor() { return color; }
public int getVelocidadActual() { return velocidadActual; }
//metodo set
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public void setMotor(int motor) { this.motor = motor; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }
    public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
    public void setColor(ColorAuto color) { this.color = color; }
    public void setVelocidadActual(int velocidadActual){
        if (velocidadActual >= 0 && velocidadActual <= velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        } else {
            System.out.println("Velocidad fuera de rango permitido.");
        }
    }
//Metodos
public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {
            velocidadActual += incrementoVelocidad;
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual -= decrementoVelocidad;
        } else {
            System.out.println("No se puede desacelerar a velocidad negativa.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distanciaKm) {
        if (velocidadActual > 0) {
            return (double) distanciaKm / velocidadActual;
        } else {
            System.out.println("Velocidad actual es cero, no se puede calcular tiempo de llegada.");
            return -1;
        }
    }

//metodo que imprime
void imprimir() {
    System.out.println("-----------------AUTOMOVIL---------------" );
    System.out.println("Marca es = " + marca);
    System.out.println("Modelo es = " + modelo);
    System.out.println("Motor es = " + motor);
    System.out.println("Tipo de combustible es = " + tipoCombustible);
    System.out.println("Tipo de automóvil es = " + tipoAutomovil);
    System.out.println("El número de puertas es = " + numeroPuertas);
    System.out.println("La cantidad de asientos = " + cantidadAsientos);
    System.out.println("Velocidad máxima es = " + velocidadMaxima);
    System.out.println("El color es = " + color);
    System.out.println("Velocidad actual : " + velocidadActual);
}
}
