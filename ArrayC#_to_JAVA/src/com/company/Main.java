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

    static int MinArray(int[] a)
    {
        int min = a[0];
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    static int MaxArray(int[] a)
    {
        int max = a[0];
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    static int NumeroAprobados(int[] a)
    {
        int aprobados = 0;
        int i;

        for(i = 0;i < a.length; i++)
        {
            if(a[i] >= 5 && a[i] <= 10)
            {
                aprobados += 1;
            }
        }
        return aprobados;
    }

    static int PorEncimaDe(int[] a, int limite)
    {
        int contador = 0;
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] >= limite)
            {
                contador += 1;
            }
        }
        return contador;
    }

    static int CuantosCeros(int[] a)
    {
        int contador = 0;
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] == 0)
            {
                contador += 1;
            }
        }
        return contador;
    }

    static void CopiaArray(int[] a, int[] b)
    {
        int i;
        int j = 0;

        if(a.length == b.length)
        {
            for(i = 0; i < a.length; i++, j++)
            {
                b[j] = b[j] + a[i];
            }
        }
        else
        {
            System.out.println("Error. Los arrays no tienen el mismo tamaño");
        }
    }

    static void CopiaArrayInvertido(int[] a, int[] b)
    {
        int i;
        int j = 0;
        int guardaPrimeraPosicion = a[0];

        if(a.length == b.length)
        {
            for(i = a.length-1; i > 0; i--,j++)
            {
                b[j] = b[j] + a[i];
            }
            b[j] += guardaPrimeraPosicion;
        }
        else
        {
            System.out.println("Error. Los arrays no son de igual tamaño.");
        }

    }

    static void SumaArrays(int[] a, int[] b, int[] suma)
    {
        int i;

        if(a.length == b.length && b.length == suma.length)
        {
            for(i = 0; i < a.length; i++)
            {
                suma[i] = a[i] + b[i];
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }

    static void RestaArrays(int[] a, int[] b, int[] resta)
    {
        int i;

        if(a.length == b.length && b.length == resta.length)
        {
            for(i = 0; i < a.length; i++)
            {
                resta[i] = a[i] - b[i];
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }

    static void MultiplicaArrays(int[] a, int[] b, int[] multiplica)
    {
        int i;

        if(a.length == b.length && b.length == multiplica.length)
        {
            for(i = 0; i < a.length; i++)
            {
                multiplica[i] = a[i] * b[i];
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }

    static void DivideArray(int[] a, int[] b, int[] divide)
    {
        int i;

        if(a.length == b.length && b.length == divide.length)
        {
            for(i = 0; i < a.length; i++)
            {
                divide[i] = a[i] / b[i];
            }
        }
        else
        {
            System.out.println("ERROR");
        }
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
        System.out.println("[15] NumerosImpares");
        System.out.println("[16] MinArray");
        System.out.println("[17] MaxArray");
        System.out.println("[18] NumeroAprobados");
        System.out.println("[19] PorEncimaDe");
        System.out.println("[20] CuantosCeros");
        System.out.println("[21] CopiaArray");
        System.out.println("[22] CopiaArrayInvertido");
        System.out.println("[23] SumaArrays");
        System.out.println("[24] RestaArrays");
        System.out.println("[25] MultiplicaArrays");
        System.out.println("[26] DivideArray");
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

            case 16:
            {
                //Escribe una función “MinArray” a la que le pasas un array y te devuelve el valor más
                //pequeño de los contenidos en dicho array.

                int min;
                int[] a = {9,89,1,6,13};

                EscribeArray(a);
                min = MinArray(a);
                System.out.println("\n" + min);
            }
            break;

            case 17:
            {
                //Escribe una función “MaxArray” que te devuelve el más grande.
                int max;
                int[] a = {23,4,78,100,1,2,7};

                EscribeArray(a);
                max = MaxArray(a);
                System.out.println("\n" + max);
            }
            break;

            case 18:
            {
                // Escribe una función “NumeroAprobados” a la que se le pasa un array de enteros y,
                //suponiendo que son notas, nos devuelve el número de aprobados (valores entre 5 y
                //10).

                int[] a = {4,3,2,7,8,9,6};
                int aprobados;

                EscribeArray(a);
                aprobados = NumeroAprobados(a);
                System.out.println("\n" + aprobados);

            }
            break;

            case 19:
            {
                // Escribe una función “PorEncimaDe” a la que le pasamos un valor “limite” y nos
                //devuelve cuántos elementos del array son iguales o mayores que ese límite. Por
                //ejemplo, le pasamos el valor 10 y nos dice cuántos elementos son 10 o más.

                int[] a = {23,45,67,8,9,1};
                int limite = 20;
                int contador;

                EscribeArray(a);
                contador = PorEncimaDe(a, limite);
                System.out.println("\n" + contador);

            }
            break;

            case 20:
            {
                // Escribe una función “CuantosCeros” a la que le pasamos un array y nos devuelve un
                //entero que nos dice cuántos elementos tienen el valor 0.

                int contador;
                int[] a = {0,0,0,0,0,0,0,12,45,78,8};

                EscribeArray(a);
                contador = CuantosCeros(a);
                System.out.println("\n" + contador);

            }
            break;

            case 21:
            {
                //Escribe una función “CopiaArray” a la que le pasas dos arrays por parámetro (array1 y
                //array2, por ejemplo) del mismo tamaño (se debería comprobar dentro de la función).
                //La función copiara el contenido del primer array al segundo array.

                int[] a = {100,200,300};
                int[] b = new int[a.length];

                System.out.print("Array 'a' = ");
                EscribeArray(a);
                CopiaArray(a,b);
                System.out.println();
                System.out.print("Array 'b' = ");
                EscribeArray(b);

            }
            break;

            case 22:
            {
                //Escribe una función “CopiaArrayInvertido” a la que le pasas dos arrays por parámetro y
                //te copia el contenido del primer array al segundo array pero en orden inverso (Ej.: si el
                //primero es [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).

                int[] a = {10,20,30,40,50};
                int[] b = new int[a.length];

                System.out.print("Array 'a' = ");
                EscribeArray(a);
                CopiaArrayInvertido(a,b);
                System.out.print("\n" + "Array 'b' = ");
                EscribeArray(b);
            }
            break;

            case 23:
            {
                // Escribe una función “SumaArrays” a la que le pasamos tres arrays. Los dos primeros
                //contendrán los datos que hay que sumar y en el tercero guardaremos el resultado (Ej.:
                //[1,2,3] + [8, 6, 8] = [9, 8, 11]).

                int[] a = {3,5,7,9};
                int[] b = {2,2,2,2};
                int[] c = new int[a.length];

                EscribeArray(a);
                System.out.print(" + ");
                EscribeArray(b);
                System.out.print(" = ");
                SumaArrays(a,b,c);
                EscribeArray(c);

            }
            break;

            case 24:
            {
                // Escribe también la función “RestaArrays”

                int[] a = {23,35,17};
                int[] b = {3,5,7};
                int[] c = new int[a.length];

                EscribeArray(a);
                System.out.print(" - ");
                EscribeArray(b);
                RestaArrays(a,b,c);
                System.out.print(" = ");
                EscribeArray(c);

            }
            break;

            case 25:
            {
                //Escribe también la función "MultiplicaArrays"

                int[] a = {3,4,5,6};
                int[] b = {3,3,3,3};
                int[] c = new int[a.length];

                EscribeArray(a);
                System.out.print(" x ");
                EscribeArray(b);
                MultiplicaArrays(a,b,c);
                System.out.print(" = ");
                EscribeArray(c);
            }
            break;

            case 26:
            {
                //Escribe también la función "DivideArray"

                int[] a = {24,36,45};
                int[] b = {6,3,5};
                int[] c = new int[a.length];

                EscribeArray(a);
                System.out.print(" / ");
                EscribeArray(b);
                DivideArray(a,b,c);
                System.out.print(" = ");
                EscribeArray(c);
            }
            break;
        }
    }
}

