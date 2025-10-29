package com.medac.practica;

import java.util.Scanner;

public class DatosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 100) + 1;
        int intento = 0;
        int intentos = 0;

        System.out.println("Juego: Adivina el número (1–100)");
        while (intento != secreto) {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < secreto)
                System.out.println("Demasiado bajo!");
            else if (intento > secreto)
                System.out.println("Demasiado alto!");
            else
                System.out.println("Correcto! Has adivinado el número en " + intentos + " intentos!");
        }
        sc.close();
    }
}