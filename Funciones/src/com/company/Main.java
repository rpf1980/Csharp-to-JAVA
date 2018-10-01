package com.company;

import java.util.Scanner;

public class Main
{
    static boolean Par( int valor)
    {
        boolean pares;
        if(valor %2 == 0)
        {
            pares = true;
        }
        else
        {
            pares = false;
        }
        return pares;
    }

    static boolean Bisiesto(int anio)
    {
        boolean b;
        if(anio % 4 == 0 && ((anio %100 != 0) || (anio %400 == 0)))
        {
            b = true;
        }
        else
        {
            b = false;
        }
        return b;
    }

    static void TablaMultiplicar(int n)
    {
        int i;
        for(i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    static void ImprimeSerie(int a, int b)
    {

        if(a < b)
        {
            for(a = a; a <= b; a++)
            {
                System.out.println(a);
            }
        }
        else
        {
            if(a > b)
            {
                for(a = a; a >= b; a--)
                {
                    System.out.println(a);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("MENÚ FUNCIONES cSharp to Java");
        System.out.println("=============================");
        System.out.println("[1] Par");
        System.out.println("[2] Bisiesto");
        System.out.println("[3] TablaMultiplicar");
        System.out.println("[4] ImprimeSerie");
        System.out.println();
        System.out.print("Elige opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                {
                    //Escribe una función que te diga si un número es par o no. La función se llamará “Par” y
                    //nos devolverá un valor booleano que será “verdadero” si el número es par y “falso” si
                    //es impar.

                    int n;
                    boolean par;

                    System.out.println("Escribe el número: ");
                    n = sc.nextInt();

                    par = Par(n);
                    System.out.println(par);

                }
                break;

            case 2:
            {
                int anio;
                boolean bisiesto;

                System.out.println("Escribe el año: ");
                anio = sc.nextInt();

                bisiesto = Bisiesto(anio);
                System.out.println(bisiesto);
            }
            break;

            case 3:
            {
                int n;
                System.out.println("Escribe un número para mostrarte su tabla de multiplicar: ");
                n = sc.nextInt();

                TablaMultiplicar(n);
            }
            break;

            case 4:
            {
                int a, b;
                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                ImprimeSerie(a, b);
            }
            break;
        }

    }
}
