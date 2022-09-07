package com.codigomorsa.tutorialmod.tuto;

import static com.codigomorsa.tutorialmod.tuto.Utils.println;

public class Comparaciones {

    public static void main(String[] args) {

        int precioPanPanaderia1 = 2000;
        int precioPanPanderia2 = 2600;

        println((precioPanPanaderia1 > precioPanPanderia2) + "");
        println((precioPanPanaderia1 < precioPanPanderia2) + "");

        println((precioPanPanaderia1 == precioPanPanderia2) + "");

        int a = 10;
        int b = 15;
        int c = 10;

        println((a == c) + "");
        println((b >= c) + "");
        println((a <= c) + "");
        println((b <= c) + "");

        println((2.6 > 1.4) + "");

        println(("codigomorsa" == "perro") + "");
        println(("codigomorsa" == "codigomorsa") + "");
        println(("codigomorsa".equals("codigomorsa")) + "");
    }
}
