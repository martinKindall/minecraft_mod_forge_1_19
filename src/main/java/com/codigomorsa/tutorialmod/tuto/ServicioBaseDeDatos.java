package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.DatabaseConexion.DATABASE_URL;
import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class ServicioBaseDeDatos {

    public static void main(String[] args) {
        String resultado = buscarInformacionEnDB();
        println("Busqueda terminada: " + resultado);
    }

    public static String buscarInformacionEnDB() {
        println("Buscando la informacion en la base de datos con url: " + DATABASE_URL);

        return "Informacion: 123456789";
    }
}
