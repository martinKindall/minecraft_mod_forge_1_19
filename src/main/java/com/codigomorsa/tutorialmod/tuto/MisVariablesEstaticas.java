package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class MisVariablesEstaticas {

    public static String nombre = "Martin";

    public static void main(String[] args) {

        saludarEnCastellano();
        saludarEnIngles();
    }

    public static void saludarEnCastellano() {
        println("Feliz cumpleaños " + nombre);
    }

    public static void saludarEnIngles() {
        println("Happy birthday " + nombre);
    }
}
