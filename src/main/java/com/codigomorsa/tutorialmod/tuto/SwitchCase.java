package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.*;

public class SwitchCase {

    public static void main(String[] args) {

        String elDiaDeHoy = input("Que dia es hoy? ");

        switch (elDiaDeHoy) {
            case "Lunes": {
                println("Hoy toca lavar ropa.");
                break;
            }
            case "Martes": {
                println("Hoy toca ver series.");
                break;
            }
            case "Miercoles": {
                println("Hoy toca subir video al canal / escribir blog en medium.");
            }
            case "Jueves": {
                println("Ir al cine");
                break;
            }
            case "Viernes": {
                println("Hoy se sale!");
                break;
            }
            case "Sabado": {
                println("Hoy se modea en minecraft");
                break;
            }
            case "Domingo": {
                println("Hoy ir a la playa");
                break;
            }
            default: {
                println("No escribiste un dia de la semana! Intenta de nuevo");
            }
        }

        int numero = inputInt("Escribe un digito entre el 0 y el 9: ");

        switch (numero) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8: {
                println("Es un numero par");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9: {
                println("Es un numero impar");
                break;
            }
            default: {
                println("Recuerda que solo se acepta un digito entre 0 y 9!");
            }
        }
    }
}
