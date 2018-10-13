package com.company;

import java.util.Scanner;

public class Main
{

    static void EscribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < 5; i++)
        {
            System.out.print(i + ",");
        }
        System.out.print(a[4]);
        System.out.print("]");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("MENÚ ARRAYS C# TO JAVA");
        System.out.println("======================");
        System.out.println("[1] EscribeArray5");
        System.out.println("[2] ");
        System.out.println("[3] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función “EscribeArray5” a la que le pasamos un array de tipo entero de
                //cinco elementos y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]
            }
            break;
        }
    }
}

