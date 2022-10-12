package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.inputInt;
import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class Funciones {

    public static void main(String[] args) {

        int edad = inputInt("Que edad tienes?");

        if (esMayorDeEdad(edad)) {
            println("Sí eres mayor de edad");
        } else {
            println("Aun no eres mayor de edad");
        }
    }

    public static boolean esMayorDeEdad(int edadPersona) {
        return edadPersona >= 21;
    }
}
