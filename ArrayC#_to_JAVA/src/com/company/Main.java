package com.company;

import java.util.Scanner;

public class Main
{
    static void EscribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < 4; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[4]);
        System.out.print("]");
    }

    static void EscribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length-1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length-1]);
        System.out.print("]");
    }

    static void EscribeArrayDouble(double[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length-1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length-1] + "]");
    }

    static void EscribeArrayBolean(boolean[] a)
    {
        System.out.print("[");
        for(int i = 0; i < a.length-1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length-1] + "]");
    }

    static void LeeArray5(int[] a)
    {
        Scanner lee5 = new Scanner(System.in);

        int i;
        for(i = 0; i < 5; i++)
        {
            System.out.print("Valor: ");
            a[i] = lee5.nextInt();
        }
    }

    static void LeeArray(int[] a)
    {
        Scanner leelength = new Scanner(System.in);
        int i;
        for(i = 0; i < a.length; i++)
        {
            System.out.print("Valor: ");
            a[i] = leelength.nextInt();
        }
    }

    static void PonCero5(int[] a)
    {
        int i;
        for(i = 0; i < 5; i++)
        {
            a[i] = 0;
        }
    }

    static void PonCero(int[] a)
    {
        int i;
        for(i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }
    }

    static int SumaArray5(int[] a)
    {
        int suma = 0;
        int i;
        for(i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }

    static int SumaArray(int[] a)
    {
        int suma = 0;
        int i;
        for(i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        return suma;
    }

    static int MediaArray5(int[] a)
    {
        int suma = 0;
        int media;
        int i;

        for(i = 0; i < 5; i++)
        {
            suma += a[i];
        }
        media = suma / 5;
        return media;
    }

    static int MediaArray(int[] a)
    {
        int suma = 0;
        int media;
        int i;

        for(i = 0; i < a.length; i++)
        {
            suma += a[i];
        }
        media = suma / a.length;
        return media;
    }

    static void RellenaEnOrden(int[] a)
    {
        int ordena = 1;
        int i;
        for(i = 0; i < a.length; i++)
        {
            a[i] = ordena;
            ordena = ordena + 1;
        }
    }

    static void RellenaEnOrdenDesc(int[] a)
    {
        int ordena = a.length;
        int i;
        for(i = 0; i < a.length; i++)
        {
            a[i] = ordena;
            ordena = ordena - 1;
        }
    }

    static void RellenaAleatorio(int[] a)
    {
        int alea;
        int i;

        for(i = 0; i < a.length; i++)
        {
            alea = (int)(Math.random()*10+1);
            a[i] = alea;
        }

    }

    static boolean EstaOrdenado(int[] a)
    {
        boolean ordenado = true;
        int i;
        for(i = 0; i < a.length-1; i++)
        {
            if(a[i] > a[i + 1])
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    static int NumeroImpares(int[] a)
    {
        int contador = 0;
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] %2 != 0)
            {
                contador += 1;
            }
        }
        return contador;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("MENÚ ARRAYS C# TO JAVA");
        System.out.println("======================");
        System.out.println("[1] EscribeArray5");
        System.out.println("[2] EscribeArray");
        System.out.println("[3] LeeArray5");
        System.out.println("[4] LeeArray");
        System.out.println("[5] PonCero5");
        System.out.println("[6] PonCero");
        System.out.println("[7] SumaArray5");
        System.out.println("[8] SumaArray");
        System.out.println("[9] MediaArray5");
        System.out.println("[10] MediaArray");
        System.out.println("[11] RellenaEnOrden");
        System.out.println("[12] RellenaEnOrdenDesc");
        System.out.println("[13] RellenaAleatorio");
        System.out.println("[14] EstaOrdenado");
        System.out.println("[15] NumeroImpares");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe una función “EscribeArray5” a la que le pasamos un array de tipo entero de
                //cinco elementos y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]

                int[] array = {10,20,30,40,50};
                EscribeArray5(array);
            }
            break;

            case 2:
            {
                // Escribe una función “EscribeArray” a la que le pasamos un array de enteros del tamaño
                //que sea y lo escribe por pantalla de la misma forma. Tendremos que usar la propiedad
                //“Length” para saber el tamaño del array desde dentro de la función.

                int[] array;
                int tama;

                System.out.print("Tamaño del array: ");
                tama = sc.nextInt();

                array = new int[tama];

                EscribeArray(array);
            }
            break;

            case 3:
            {
                // Escribe una función “LeeArray5” que lea un array de enteros de 5 elementos. Habrá
                //que pasarle el array ya definido y él lo rellenará pidiéndole los valores al usuario por
                //consola.

                int[] array = new int[5];
                LeeArray5(array);
                EscribeArray5(array);
            }
            break;

            case 4:
            {
                // Escribe una función “LeeArray” que lea un array de enteros de cualquier tamaño. El
                //array lo crearemos fuera de la función y dentro de la función usaremos la propiedad
                //“Length” para saber cuál es el tamaño y cuántos datos debemos leer.

                int[] array = {12,13,14,15,33};
                LeeArray(array);
                EscribeArray(array);
            }
            break;

            case 5:
            {
                //Escribe una función “PonCeros5” que modifique el contenido de un array de enteros
                //de cinco elementos y ponga en todas las posiciones un 0.

                int[] array = {1,2,3,4,5};

                PonCero5(array);
                EscribeArray5(array);
            }
            break;

            case 6:
            {
                //Escribe una función “PonCero” que haga lo mismo para un array de enteros de
                //cualquier tamaño.

                int[] array = {1,2,3,4,5,6,7,8,9};

                PonCero(array);
                EscribeArray(array);

            }
            break;

            case 7:
            {
                // Escribe una función “SumaArray5” que sume todas las posiciones de un array de
                //enteros de cinco elementos y nos devuelva el resultado.

                int[] array = {12,12,12,12,12};
                int suma;

                EscribeArray5(array);
                suma = SumaArray5(array);
                System.out.println("\n   SUMA = " + suma);

            }
            break;

            case 8:
            {
                //Escriba una función “SumaArray” que haga lo mismo para un array de enteros de
                //cualquier tamaño.

                int[] array = {5,6,7,8,9,1};
                int suma;

                EscribeArray(array);
                suma = SumaArray(array);
                System.out.println("\n SUMA = " + suma);
            }
            break;

            case 9:
            {
                //Escribe una función “MediaArray5” que nos calcule el valor medio de los elementos de
                //un array de enteros de tamaño 5.

                int[] array = {5,5,5,5,5};
                int media;

                EscribeArray5(array);
                media = MediaArray5(array);
                System.out.println("\n MEDIA = " + media);
            }
            break;

            case 10:
            {
                //Escribe una función “MediaArray” que haga lo mismo para un array de enteros de
                //cualquier tamaño.

                int[] array = {10,10,10,10,10,10,10,10,10,10,10,10};
                int media;

                EscribeArray(array);
                media = MediaArray(array);
                System.out.println("\n MEDIA = " + media);
            }
            break;

            case 11:
            {
                //Escribe una función “RellenaEnOrden” que nos rellena un array de enteros con los
                //números desde el 1 en adelante (1, 2, 3, 4... hasta el tamaño del array).

                int[] a = new int[4];
                RellenaEnOrden(a);
                EscribeArray(a);
            }
            break;

            case 12:
            {
                //Escribe una función “RellenaEnOrdenDesc” que nos rellena un array con los valores
                //siguientes: tamaño del array, tamaño del array-1, etc., 3, 2, 1.

                int[] a = new int[5];
                RellenaEnOrdenDesc(a);
                EscribeArray(a);
            }
            break;

            case 13:
            {
                //Escribe una función “RellenaAleatorio” a la que le pasamos un array de enteros y nos
                //lo rellena de valores aleatorios entre 1 y 10.

                int[] array = new int[20];
                RellenaAleatorio(array);
                EscribeArray(array);

            }
            break;

            case 14:
            {
                // Escribe una función “EstaOrdenado” a la que le pasas un array de enteros y te
                //devuelve un booleano que será verdadero si los elementos del array se encuentran en
                //orden ascendente.

                boolean ordenado;
                int[] array = {12,5,8,9};

                EscribeArray(array);
                System.out.println("\n" + EstaOrdenado(array));

            }
            break;

            case 15:
            {
                // Escribe una función “NumeroImpares” a la que le pasas un array de enteros y te
                //devuelve un entero que corresponde a la cantidad de números impares que tenemos
                //en el array.

                int[] array = {3,7,9,2,4,6,8};
                int impares;

                EscribeArray(array);
                impares = NumeroImpares(array);
                System.out.println("\n"+"IMPARES = " + impares);
            }
            break;
        }
    }
}

