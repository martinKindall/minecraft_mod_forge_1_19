package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.input;
import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class EjVoid {

    public static void main(String[] args) {
        // saludar(input("Ingresa tu nombre: "), input("Ingresa tu apelldido: "));

        String nombre = "Morsa";
        int edad = 33;
        boolean tengoHijos = false;

        pronosticoDelDia();

        String pais = "Alemania";
        String origen = "Chile";

        pronosticoDelDia();
    }

    public static void saludar(String nombre, String apellido) {
        println("Hola " + nombre + " " + apellido + "! Bienvedin@ a nuestro tutorial de Java!!!");
    }

    public static void pronosticoDelDia() {
        println("Buscando informacion en el servidor....");
        println("La temperatura de hoy es 24 grados.");
        println("Guardando la temperatura en la base de datos local.");

        saludar("carla", "bruni");
    }
}
