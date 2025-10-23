package com.medac.practica;

import java.util.Scanner;

public class DatosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("🎯 Guess the Number Game (1–100)");
        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secret)
                System.out.println("Too low!");
            else if (guess > secret)
                System.out.println("Too high!");
            else
                System.out.println("🎉 Correct! You guessed it in " + attempts + " tries!");
        }
        sc.close();
    }
}
