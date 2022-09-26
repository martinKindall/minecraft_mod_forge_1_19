package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.inputInt;
import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class Programa2 {

    public static void main(String[] args) {

        int edad = inputInt("Cual es tu edad? ");
        int limiteEdad = 18;
        int senior = 65;
        int ultraAnciano = 100;

        if (edad < limiteEdad) {
            println("No tienes la edad suficiente aún.");
        } else if (edad >= limiteEdad && edad < senior) {
            println("Puedes pasar a la disco, buen perreo!");
        } else if (edad < ultraAnciano) {
            println("Te felicito por seguir con tanta energia a tu edad.");
        } else {
            println("Eres de verdad??");
        }
    }
}
