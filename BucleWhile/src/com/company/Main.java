package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("BUCLE WHILE a JAVA");
        System.out.println("==================");
        System.out.println("[9] Números del 10 al 20");
        System.out.println("[10] Impares entre 1 y 10");
        System.out.println("[11] 10 primeros números pares");
        System.out.println("[12] Pares / Impares");
        System.out.println("[13] Tabla de multiplicar");
        System.out.println("[14] Comprendidos entre ambos");
        System.out.println("[15] Ascendente / Descendente");
        System.out.println("[16] ¿A y B ... mayor ? Imprime impares");
        System.out.println("[17] Suma de todos los pares entre 1 y 1000");
        System.out.println("[18] Valor medio de enteros - Termina con 0");
        System.out.println("[19] Notas de 30 alumnos");
        System.out.println("[20] Valor máximo de 10 números");
        System.out.println("[21] Mayor | Menor | Medio");  //*La media da un número de menos*
        System.out.println("[22] Factorial de un número");

        System.out.println("Elige una opción");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 9:
                {
                    int i;
                    i = 10;
                    while(i <= 20)
                    {
                        System.out.println(i);
                        i++;
                    }
                }
                break;

            case 10:
                {
                    int i;
                    i = 1;
                    while(i <= 10)
                    {
                        System.out.println(i);
                        i = i + 2;
                    }
                }
                break;

            case 11:
                {
                    int i;
                    i = 2;
                    while(i <= 20)
                    {
                        System.out.println(i);
                        i = i + 2;
                    }
                }
                break;

            case 12:
                {
                    int i;
                    String tipo;
                    System.out.println("Elige pares o impares: ");
                    tipo = sc.next();

                    if(tipo.equals("pares"))
                    {
                        i = 2;
                        while(i < 11)
                        {
                            System.out.println(i);
                            i = i + 2;
                        }
                    }

                    if(tipo.equals("impares"))
                    {
                        i = 1;
                        while(i < 11)
                        {
                            System.out.println(i);
                            i = i + 2;
                        }
                    }
                }
                break;

            case 13:
                {
                    int n, i;

                    //Leemos número
                    System.out.println("Escribe un número para mostrarte su tabla de multiplicar: ");
                    n = sc.nextInt();

                    i = 1;
                    while(i <= 10)
                    {
                        System.out.println(n + " x " + i + " = " + (n * i));
                        i++;
                    }
                }
                break;

            case 14:
                {
                    int n1, n2;

                    //Leemos números
                    System.out.println("Escribe un número: ");
                    n1 = sc.nextInt();
                    System.out.println("Escribe otro número: ");
                    n2 = sc.nextInt();

                    while(n1 > n2)
                    {
                        System.out.println("El primer número debe ser menor");
                        System.out.println("Escribe un número: ");
                        n1 = sc.nextInt();
                        System.out.println("Escribe otro número: ");
                        n2 = sc.nextInt();
                    }

                    while(n1 <= n2)
                    {
                        System.out.println(n1);
                        n1 = n1 + 1;
                    }
                }
                break;

            case 15:
                {
                    int a, b;
                    System.out.println("Escribe dos números");
                    a = sc.nextInt();
                    b = sc.nextInt();

                    while(a <= b)
                    {
                        System.out.println(a);
                        a++;
                    }
                    while(a >= b)
                    {
                        System.out.println(a);
                        a--;
                    }
                }
                break;

            case 16:
                {
                    int a, b;
                    int i;

                    //Leemos los datos
                    System.out.println("Escribe primer número: ");
                    a = sc.nextInt();
                    System.out.println("Escribe segundo número: ");
                    b = sc.nextInt();

                    //Primera condición que los números sean distintos. Si son iguales, ninguno sería mayor que otro.
                    if(a != b)
                    {
                        while(a < b)
                        {
                            if(a %2 != 0)
                            {
                                System.out.println(a);
                            }
                            a++;
                        }
                        while(b < a)
                        {
                            if(b %2 != 0)
                            {
                                System.out.println(b);
                            }
                            b++;
                        }
                    }
                    else
                        {
                            System.out.println("¡Error! Los números no pueden ser iguales");
                        }

                }
                break;

            case 17:
                {
                    int n = 0;

                    while (n <= 1000)
                    {
                        if(n %2 == 0)
                        {
                            System.out.println(n);
                        }
                        n++;
                    }
                }
                break;

            case 18:
                {
                    int valor, media;
                    int suma = 0;
                    int contador = 0;

                    //Leemos los datos
                    System.out.println("Escribe los valores: ");
                    valor = sc.nextInt();

                    //Algoritmo
                    while(valor >= 0)
                    {
                        contador++;
                        suma = suma + valor;
                        System.out.println("Escribe los valores: ");
                        valor = sc.nextInt();
                    }
                    media = suma / contador;
                    System.out.println("Suma = " + suma);
                    System.out.println("Media = " + media);

                }
                break;

            case 19:
                {
                    int nota = 0;
                    int aprobado = 0;
                    int suspenso = 0;
                    int i;

                    //Pedimos las notas

                    i = 0;
                    while(i < 5)
                    {
                        System.out.println("Escribe nota: ");
                        nota = sc.nextInt();

                        if(nota > 0 && nota < 5)
                        {
                            suspenso++;
                        }
                        else
                        {
                            if(nota >= 5 && nota <= 10)
                            {
                                aprobado++;
                            }
                        }
                        i++;
                    }
                    System.out.println("Aprobados = " + aprobado);
                    System.out.println("Suspensos = " + suspenso);
                }
                break;

            case 20:
                {
                    int n, max;
                    int i;

                    System.out.println("Escribe números: ");
                    n = sc.nextInt();
                    max = n;

                    i = 1;
                    while(i < 10)
                    {
                        System.out.println("Escribe números: ");
                        n = sc.nextInt();

                        if(n > max)
                        {
                            max = n;
                        }
                        i++;
                    }
                    System.out.println("El mayor de los 10 números es = " + max);

                }
                break;

            case 21:
                {
                    int max, min, media;
                    int suma = 0;
                    int contador = 1;
                    int n;
                    int i;

                    System.out.println("Escribe un número: ");
                    n = sc.nextInt();
                    max = n;
                    min = n;

                    i = 1;
                    while(i < 5)
                    {
                        contador++;
                        System.out.println("Escribe un número: ");
                        n = sc.nextInt();

                        if(n > max)
                        {
                            max = n;
                        }
                        else
                            {
                                if(n < max)
                                {
                                    min = n;
                                }
                            }
                        suma = suma + n;
                        i++;

                    }
                    media = suma /contador;
                    System.out.println("Valor mayor = " + max);
                    System.out.println("Valor menor = " + min);
                    System.out.println("Valor medio = " + media);
                }
                break;

            case 22:
                {
                    int n, i;
                    int factorial = 1;

                    System.out.println("Escribe un números para calcular su factorial: ");
                    n = sc.nextInt();

                    i = 1;
                    while(i <= n)
                    {
                        factorial = factorial * i;
                        i++;
                    }
                    System.out.println("Factorial de " + n + " = " + factorial);
                }
                break;
        }
    }
}

