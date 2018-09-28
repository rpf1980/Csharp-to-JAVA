package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println("BUCLE FOR a JAVA");
        System.out.println("================");
        System.out.println("[23] Números del 10 al 20");
        System.out.println("[24] Impares entre 1 y 10");
        System.out.println("[25] 10 primeros números pares");
        System.out.println("[26] Pares o Impares");
        System.out.println("[27] Tabla multiplicar");
        System.out.println("[28] Mayor - Menor || Ascendente - Descendente");
        System.out.println("[29] Impares entre A y B");
        System.out.println("[30] Suma los pares del 1 al 1000");
        System.out.println("[31] Profesor: suspensos / aprobados");
        System.out.println("[32] Valor máximo de 10 números");
        System.out.println("[33] Mayor - Menor - Media");  //*Resultado media da un número más*
        System.out.println("[34] Calcular factorial de un entero");
        System.out.println("[35] Notas alumnos");
        System.out.println("[36] 10 primeros no múltiplos de 2 ni de 3");
        System.out.println("[37] Menú 3 opciones: Multiplos de 11, 17, 23");
        System.out.println("[38] Calcular MCD");
        System.out.println("[39] Calcular MCM");
        System.out.println("[40] Número primo");
        System.out.println("[41] Primos entre 2 y 1000");
        System.out.println("[42] Juego del número secreto");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 23:
                {
                    int i;
                    for(i = 10; i <= 20; i++)
                    {
                        System.out.println(i);
                    }
                }
                break;

            case 24:
                {
                    int i;
                    for(i = 1; i <= 10; i = i + 2)
                    {
                        System.out.println(i);
                    }
                }
                break;

            case 25:
                {
                    int i;
                    int contador = 0;

                    for(i = 1; i < 100; i++)
                    {
                        if(i %2 == 0)
                        {
                            contador++;
                            if(contador <= 10)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                }
                break;

            case 26:
                {
                    int i;
                    String tipo;

                    System.out.println("Elige PARES o IMPARES");
                    tipo = sc.next();

                    if(tipo.equals("PARES"))
                    {
                        for(i = 2; i <= 10; i = i + 2)
                        {
                            System.out.println(i);
                        }
                    }
                    else
                        {
                            if(tipo.equals("IMPARES"))
                            {
                                for(i = 1; i <= 10; i = i + 2)
                                {
                                    System.out.println(i);
                                }
                            }
                        }
                }
                break;

            case 27:
                {
                    int i, n;

                    System.out.println("Escribe un número para mostrarte su tabla de multiplicar: ");
                    n = sc.nextInt();

                    for(i = 1; i <= 10; i++)
                    {
                        System.out.println(n + " x " + i + " = " + (n*i));
                    }
                }
                break;

            case 28:
                {
                    int i;
                    int a, b;

                    System.out.println("Escribe un número: ");
                    a = sc.nextInt();
                    System.out.println("Escribe otro número: ");
                    b = sc.nextInt();

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
                break;

            case 29:
                {
                    int a, b;

                    System.out.println("Escribe un número: ");
                    a = sc.nextInt();
                    System.out.println("Escribe otro: ");
                    b = sc.nextInt();

                    while(a < b)
                    {
                        for(a = a; a <= b; a++)
                        {
                            if(a %2 != 0)
                            {
                                System.out.println(a);
                            }
                        }
                    }
                    while(b < a)
                    {
                        for(b = b; b <= a; b++)
                        {
                            if(b %2 != 0)
                            {
                                System.out.println(b);
                            }
                        }
                    }
                }
                break;

            case 30:
                {
                    int i;
                    int suma = 0;

                    for(i = 0; i <= 1000; i++)
                    {
                        if(i %2 == 0)
                        {
                            System.out.println(i);
                            suma = suma + i;
                        }
                    }
                }
                break;

            case 31:
                {
                    int suspenso = 0, aprobado = 0;
                    int nota;
                    int i;

                    for(i = 0; i < 5; i++)
                    {
                        System.out.println("Escribe nota: ");
                        nota = sc.nextInt();

                        if(nota < 5)
                        {
                            suspenso++;
                        }
                        else
                            {
                                aprobado++;
                            }
                    }
                    System.out.println("Aprobados = " + aprobado);
                    System.out.println("Suspensos = " + suspenso);

                }
                break;

            case 32:
                {
                    int n, max, i;

                    System.out.println("Escribe valor: ");
                    n = sc.nextInt();
                    max = n;

                    for(i = 1; i < 10; i++)
                    {
                        System.out.println("Escribe valor:");
                        n = sc.nextInt();

                        if(n > max)
                        {
                            max = n;
                        }
                    }
                    System.out.println("El número mayor es = " + max);
                }
                break;

            case 33:
                {
                    int max, min, media, n, i;
                    int suma = 0;
                    int contador;

                    System.out.println("Escribe valor: ");
                    n = sc.nextInt();
                    max = n;
                    min = n;
                    contador = 1;
                    suma = suma + n;

                    for(i = 1; i < 3; i++)
                    {
                        System.out.println("Escribe valor: ");
                        n = sc.nextInt();

                        if(n > max)
                        {
                            max = n;
                        }
                        else
                            {
                                if(n < min)
                                {
                                    min = n;
                                }
                            }
                        suma = suma + n;
						contador++;
                        
                    }
                    media = suma / contador;
                    System.out.println("Mayor = " + max);
                    System.out.println("Menor = " + min);
                    System.out.println("Media = " + media);

                }
                break;

            case 34:
                {
                    int n, factorial, i;
                    factorial = 1;

                    System.out.print("Escribe un entero: ");
                    n = sc.nextInt();

                    for(i = 1; i <= n; i++)
                    {
                        factorial = factorial * i;
                    }
                    System.out.println("Factorial de " + n + " = " + factorial);
                }
                break;

            case 35:
                {
                    double nota;

                    //Pedimos la primera nota fuera del bucle para poder instanciar la variable nota
                    System.out.print("Escribe nota: ");
                    nota = sc.nextDouble();

                    //Condiciones
                    while(nota < 0 || nota > 10)
                    {
                        System.out.println("¡ La nota no es válida !");
                        System.out.print("Escribe nota: ");
                        nota = sc.nextDouble();
                    }

                    if(nota >= 0 && nota < 5)
                    {
                        System.out.println("SUSPENSO");
                    }
                    else
                        {
                            if(nota >= 5 && nota <= 6)
                            {
                                System.out.println("SUFICIENTE");
                            }
                            else
                                {
                                    if(nota > 6 && nota <= 7)
                                    {
                                        System.out.println("BIEN");
                                    }
                                    else
                                        {
                                            if(nota > 7 && nota < 9)
                                            {
                                                System.out.println("NOTABLE");
                                            }
                                            else
                                                {
                                                    if(nota > 9 && nota <= 10)
                                                    {
                                                        System.out.println("SOBRESALIENTE");
                                                    }
                                                }
                                        }
                                }
                        }
                }
                break;

            case 36:
                {
                    int i;
                    int contador = 0;

                    i = 0;
                    while(i < 100)
                    {
                        if(i %2 != 0 && i %3 != 0)
                        {
                            contador++;
                            if(contador <= 10)
                            {
                                System.out.println(i);
                            }
                        }
                        i++;
                    }
                }
                break;

            case 37:
                {
                    int i;
                    String elige;


                    System.out.println("=============");
                    System.out.println("MENÚ OPCIONES");
                    System.out.println("=============");
                    System.out.println("a) Múltiplos de 11 del 1 al 100");
                    System.out.println("b) Múltiplos de 17 del 1 al 100");
                    System.out.println("c) Múltiplos de 23 del 1 al 100");
                    System.out.println();
                    System.out.print("Elige una opción: ");
                    elige = sc.next();

                    switch (elige)
                    {
                        case "a":
                            {
                                for(i = 1; i <= 100; i++)
                                {
                                    if(i %11 == 0)
                                    {
                                        System.out.println(i);
                                    }
                                }
                            }
                            break;

                        case "b":
                            {
                                for(i = 1; i <= 100; i++)
                                {
                                    if(i %17 == 0)
                                    {
                                        System.out.println(i);
                                    }
                                }
                            }
                            break;

                        case "c":
                            {
                                for(i = 1; i <= 100;i++)
                                {
                                    if(i %23 == 0)
                                    {
                                        System.out.println(i);
                                    }
                                }
                            }
                            break;
                    }

                }
                break;

            case 38:
                {
                    //El MCD de dos números es el número natural más grande que divide a ambos

                    int a,b, divisor;


                    //Leemos los númeos
                    System.out.println("Escribe un número: ");
                    a = sc.nextInt();
                    System.out.println("Escribe otro: ");
                    b = sc.nextInt();

                    //Seleccionamos el menor de los dos números
                    if(a > b)
                    {
                        divisor = b;
                    }
                    else
                        {
                            divisor = a;
                        }

                    //Ahora empezamos a probar si ese número es el mcd o lo son
                    //los sucesivos inferiores a él
                    while((a %divisor != 0 || b %divisor != 0) && divisor > 1)
                    {
                        divisor--;
                    }
                    //Para salir del bucle se deben cumplir las dos condiciones:
                    //- divisor es un mcd de ambos números
                    //- divisor ha llegado a valer 1, con lo cual ese es el mcd

                    System.out.println("El mcd de " + a + " y " + b + " = " + divisor);

                }
                break;

            case 39:
                {
                    int a, b, multiplo;

                    //Leemos los números
                    System.out.println("Escribe un número: ");
                    a = sc.nextInt();
                    System.out.println("Escribe otro: ");
                    b = sc.nextInt();


                    //Lo primero es seleccionar el mayor de los dos
                    if(a > b)
                    {
                        multiplo = a;
                    }
                    else
                        {
                            multiplo = b;
                        }
                    //Ahora vamos probando si ese número es el mcm o lo son
                    //los sucesivos superiories a él
                    while(multiplo %a != 0 || multiplo %b != 0)
                    {
                        multiplo++;
                    }
                    //Para salir del bucle, se deben cumplir:
                    //-multiplo es un número múltiplo de a y b simultánemante
                    System.out.println("MCM de " + a + " y " + b + " = " + multiplo);

                }
                break;

            case 40:
                {
                    int numero, divisores, i;
                    divisores = 0;

                    System.out.println("Escribe un número: ");
                    numero = sc.nextInt();

                    i = 1;
                    while(i <= numero)
                    {
                        if(numero %i == 0)
                        {
                            divisores++;
                        }
                        i++;
                    }

                    if(divisores > 2)
                    {
                        System.out.println("El número " + numero + " no es primo.");
                    }
                    else
                        {
                            System.out.println("El número " + numero + " es primo");
                        }

                }
                break;

            case 41:
                {
                    int numero, i, divisor;

                    //El for nos recorre los números existentes del 2 al 1000
                    //Comienza con el primer número primo = 2
                    for(numero = 2; numero <= 1000; numero++)
                    {
                        divisor = 0;
                        i = 1; //Damos a la primera iteración del while el valor 1 para que compare ese valor, ya que el nº primo es divisible por sí mismo y por el 1
                        while(i <= numero)  //Mientras vaya desde el 1 hasta el número que está comprobando
                        {
                            if(numero %i == 0) //Y si ese número que comprueba es divisible con resto 0
                            {
                                divisor = divisor + 1;  //Suman en contador
                            }
                            i++;  //Completamos las iteraciones del bucle while
                        }
                        if(divisor <= 2) //Condición: menor o igual a 2 divisores
                        {
                            System.out.println(numero + " ");
                        }
                    }
                }
                break;

            case 42:
                {
                    //Generamos números aleatorio y convertimos a int, puesto que el método random genera números con decimales
                    int aleatorio = (int) (Math.random()*100+1);

                    int intentos = 1; //Marcamos el contador con 1 porque ya pedimos una vez el número antes de que entre en bucle
                    int n, i;
                    //Pedimos y leemos el primer número
                    System.out.print("Escribe un número: ");
                    n = sc.nextInt();

                    //Bucle que comprueba la condición principal del juego
                    while(n != aleatorio)
                    {
                        if(n < aleatorio)
                        {
                            intentos++;
                            System.out.println("Tu número es menor. " + "Siga jugando: ");
                            n = sc.nextInt();
                        }
                        else
                            {
                                if(n > aleatorio)
                                {
                                    intentos++;
                                    System.out.println("Tu número es mayor. " + "Siga jugando: ");
                                    n = sc.nextInt();
                                }
                            }
                    }

                    if(intentos == 1)
                    {
                        System.out.println("¡Muy bien!." + "¡Acertaste a la primera!");
                        System.out.println("Intentos = " + intentos);
                    }
                    else
                        {
                            if(intentos > 1 && intentos > 7)
                            {
                                System.out.println("¡Llegaste al menos!");
                                System.out.println("Intentos = " + intentos);
                            }
                            else
                                {
                                    if(intentos > 7)
                                    {
                                        System.out.println("¡TE HA COSTADO TRABAJITO, AMIGO!");
                                        System.out.println("Intentos = " + intentos);
                                    }
                                }
                        }
                    //Algoritmo
                    /*if(aleatorio == n)
                    {
                        System.out.println("Ok... has ganado !!!");
                        System.out.println("Intentos = " + intentos);
                    }
                    else
                        {
                           if(n < aleatorio)
                           {
                               intentos++;
                               System.out.print("Tu número es menor. " + "Inténtelo de nuevo:");
                               n = sc.nextInt();
                               aleatorio = (int) (Math.random()*100+1);
                           }
                           else
                               {
                                   if(n > aleatorio)
                                   {
                                       intentos++;
                                       System.out.println("Tu número es mayor. " + "Inténtelo de nuevo");
                                       aleatorio = (int) (Math.random()*100+1);
                                   }
                               }
                        }
*/

                }
                break;


        }
    }
}
