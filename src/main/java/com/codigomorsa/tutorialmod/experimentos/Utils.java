package com.codigomorsa.tutorialmod.experimentos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

    static private final BufferedReader teclado =
            new BufferedReader(new InputStreamReader(System.in));

    static public String input(String x) {
        print(x);
        try {
            return teclado.readLine();
        } catch (Exception e) {
            throw new Error("Error reading keyboard input");
        }
    }

    static public int inputInt(String x) {
        return Integer.parseInt(input(x));
    }

    static public int inputInt() {
        return inputInt("");
    }

    static public double inputDouble(String x) {
        return Double.parseDouble(input(x));
    }

    static public double inputDouble() {
        return inputDouble("");
    }

    static public void print(String x){
        System.out.print(x);
    }

    static public void print(int x){
        System.out.print(x);
    }

    static public void print(double x){
        System.out.print(x);
    }

    static public void println(String x){
        System.out.println(x);
    }

    static public void println(int x){
        System.out.println(x);
    }

    static public void println(double x){
        System.out.println(x);
    }
}