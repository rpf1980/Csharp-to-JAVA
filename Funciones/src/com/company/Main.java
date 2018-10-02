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

    static int Signo(int n)
    {
        int devuelve = 4;
        if(n < 0)
        {
            devuelve = -1;
        }
        else
        {
            if(n == 0)
            {
                devuelve = 0;
            }
            else
            {
                if(n > 0)
                {
                    devuelve = 1;
                }
            }
        }
        return devuelve;
    }

    static int Max(int a, int b)
    {
        int mayor = 0;
        if(a > b)
        {
            mayor = a;
        }
        else
        {
            mayor = b;
        }
        return mayor;
    }

    static int Min(int a, int b)
    {
        int menor = 8;

        if(a < b)
        {
            menor = a;
        }
        else
        {
            menor = b;
        }
        return menor;
    }

    static void MCD(int a, int b)
    {
        //MCD es el mayor número por el que se divide cada uno de los números dados

        //Primero buscamos cual es el menor de los dos

        int divisor = Min(a,b);

        int i = divisor;
        //Ahora empezamos a probar si ese número es el mcd o lo son
        //los sucesivos inferiores a él
        while((a %divisor != 0 || b %divisor != 0) && divisor > 1)
        {
            divisor--;
        }
        //Para salir del bucle deben cumplirse dos condiciones:
        //- divisor es mcd de ambos números
        //- divisor ha llegado a valer 1, con lo cual ese es el mcd
        System.out.println(divisor);
    }

    static void MCM(int a, int b)
    {
        //(MCM) de dos números enteros a y b es número natural mínimo que se divide por a y b.

        //Primero seleccionamos el mayor de los dos

        int multiplo = Max(a, b);

        //Y ahora vamos probando si ese nº es el mcm o los son los sucesivos superiores a él.
        int i = multiplo;
        while(multiplo %a != 0 || multiplo %b != 0)
        {
            multiplo++;
        }
        System.out.println(multiplo);
    }

    static boolean Primo(int n)
    {

        int i, divisores = 0;
        //Primero recorremos el número que nos pasen. Desde el 1 hasta el nº en sí.
        for(i = 1; i <= n; i++)
        {
            if(n %i == 0)
            {
                divisores++;
            }
        }
        if(divisores <= 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void AreaTriangulo(int b, int h)
    {
        int area = (b * h) / 2;
        System.out.println(area);
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
        System.out.println("[5] Signo");
        System.out.println("[6] Max");
        System.out.println("[7] Min");
        System.out.println("[8] MCD");
        System.out.println("[9] MCM");
        System.out.println("[10] Primo");
        System.out.println("[11] AreaTriangulo");
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

            case 5:
            {
                //Escribe una función “Signo” a la que le pasemos un número y nos devuelva “1” si es
                //positivo, “0” si es cero y “-1” si es negativo.

                int n, respuesta;

                System.out.println("Escribe un número: ");
                n = sc.nextInt();

                respuesta = Signo(n);
                System.out.println(respuesta);
            }
            break;

            case 6:
            {
                //Escribe una función “Max” que nos devuelva el mayor de los dos números que le
                //pasemos por parámetro.

                int a, b, mayor;
                System.out.print("Escribe un número: ");
                a = sc.nextInt();
                System.out.print("Escribe otro número: ");
                b = sc.nextInt();

                mayor = Max(a, b);
                System.out.println("El mayor de " + a + " y " + b + " = " + mayor);
            }
            break;

            case 7:
            {
                // Escribe una función “Min” que nos devuelva el menor de los dos números que le
                //pasemos por parámetro.

                int a, b, menor;
                System.out.print("Escribe un número: ");
                a = sc.nextInt();
                System.out.print("Escribe otro número: ");
                b = sc.nextInt();

                menor = Min(a, b);
                System.out.println("El menor de " + a + " y " + b + " = " + menor);
            }
            break;

            case 8:
            {
                //Escribe una función que nos calcule el “MCD” de dos números.

                int a, b;

                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe segundo número: ");
                b = sc.nextInt();

                MCD(a,b);
            }
            break;

            case 9:
            {
                //Escribe una función que nos calcule el “MCM” de dos números.

                int a, b, mcm;

                System.out.print("Escribe primer número: ");
                a = sc.nextInt();
                System.out.print("Escribe primer número: ");
                b = sc.nextInt();

                System.out.print("El MCM de " + a + " y " + b + " = ");
                MCM(a,b);

            }
            break;

            case 10:
            {
                //Escribe una función “Primo” que nos devuelva “verdadero” si el número que le
                //pasamos por parámetro es primo y “falso” en caso contrario.

                int n;
                boolean primo;
                System.out.println("Escribe un número para decirte si es primo o no: ");
                n = sc.nextInt();

                primo = Primo(n);
                System.out.println(primo);
            }
            break;

            case 11:
            {
                //Escribe una función “AreaTriangulo” que te calcule el área de un triángulo. Habrá que
                //pasarle como parámetros la base y la altura.

                int b, h;
                System.out.print("Escribe la base: ");
                b = sc.nextInt();
                System.out.print("Escribe la altura: ");
                h = sc.nextInt();

                System.out.print("El area del triangulo con base " + b +
                        " y altura " + h + " es ");
                AreaTriangulo(b, h);
            }
            break;
        }

    }
}
