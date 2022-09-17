package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class OperadoresBooleanos {

    public static void main(String[] args) {

        boolean estaSoleado = false;
        int temperaturaHoy = 30;
        boolean esMayorA25LaTemp = temperaturaHoy >= 25;

        // & significa AND, && es el operador logico AND
        boolean puedoIrALaPlaya = estaSoleado && esMayorA25LaTemp;
        println("Puedo ir a la playa? " + puedoIrALaPlaya);

        // operador OR, ||

        boolean estaAbiertaPanaderiaCarlitos = false;
        boolean estaAbiertaPanaderiaDondeMaria = false;
        boolean hayAlgunaPanaderiaAbierta = estaAbiertaPanaderiaCarlitos || estaAbiertaPanaderiaDondeMaria;

        println("Hay alguna panaderia abierta? " + hayAlgunaPanaderiaAbierta);
    }
}
