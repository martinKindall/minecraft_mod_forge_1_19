package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class MisVariablesLocales {

    public static void main(String[] args) {

        int numero = 123456789;
        String direccion = "alameda 12345";

        llamarNumero(numero);

        enviarCarta(direccion);

        println("Direccion en main: " + direccion);
    }

    public static void enviarCarta(String direccion) {
        println("Enviando carta a la direccion " + direccion);
        direccion = "Washington 1234";
        println("Nueva direccion: " + direccion);
    }

    public static void llamarNumero(int whatsapp) {
        println("Llamando al numero " + whatsapp);
    }
}
