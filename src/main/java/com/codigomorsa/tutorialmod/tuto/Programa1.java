package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.*;

public class Programa1 {

    public static void main(String[] args) {

        String nombreUsuario = input("Hola! Ingresa tu nombre: ");
        int edad = inputInt("Ahora ingresa tu edad: ");

        println("Hola " + nombreUsuario + "! Tu edad es " + edad);
    }
}
