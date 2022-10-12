package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Funciones.esMayorDeEdad;
import static com.codigomorsa.tutorialmod.tuto.Utils.inputInt;
import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class LicenciaConducir {

    public static void main(String[] args) {

        int edad = inputInt("Enter your age: ");

        if (esMayorDeEdad(edad)) {
            println("You are allowed to drive.");
        } else {
            println("You are not allowed to drive");
        }
    }
}
