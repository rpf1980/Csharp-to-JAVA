package com.company;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("CONDICIONALES A JAVA");
        System.out.println("====================");
        System.out.println("[1] Resta mayor - menor");
        System.out.println("[2] Año bisiesto");
        System.out.println("[3] Conversor euros/pesetas");
        System.out.println("[4] Ordenados de menor a mayor");
        System.out.println("[5] Números consecutivos");
        System.out.println("[6] Hasta 5 cifras/enteros");
        System.out.println("[7] Ecuación 2º grado");
        System.out.println("[8] Mayor - Menor - Mediano");
        System.out.println();
        System.out.println("Escribe una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int a, b, resta;

                //Leemos los números
                System.out.print("Escribe un número: ");
                a = sc.nextInt();
                System.out.print("Escribe otro número: ");
                b = sc.nextInt();

                //Condiciones
                if(a > b)
                {
                    resta = a - b;
                    System.out.println(resta);
                }
                else
                    {
                        resta = b - a;
                        System.out.println(resta);
                    }
            }
            break;

            case 2:
                {
                    int anio;
                    boolean bisiesto;

                    System.out.println("Escribe año: ");
                    anio = sc.nextInt();

                    if(anio %4 == 0 && ((anio %100 != 0) || (anio %400 == 0)))
                    {
                        bisiesto = true;
                    }
                    else
                        {
                            bisiesto = false;
                        }

                    if(bisiesto)
                    {
                        System.out.println("El año " + anio + " es bisiesto.");
                    }
                    else
                        {
                            System.out.println("El año " + anio + " no es bisiesto");
                        }
                }
                break;

            case 3:
                {
                    double valor, resultado;
                    String moneda;

                    //Usamos método para reducir el número de decimales de nuestro resultado
                    DecimalFormat df = new DecimalFormat("#.00");

                    //Leemos los datos
                    System.out.println("¿Quieres convertir euros o pesetas?");
                    moneda = sc.next();

                    //Algoritmo
                    if(moneda.equals("euros"))
                    {
                        System.out.println("Escribe la cantidad de moneda euro: ");
                        valor = sc.nextDouble();

                        resultado = valor * 166.386;
                        System.out.println(df.format(resultado) + " pts");

                    }
                    else
                        {
                            if(moneda.equals("pesetas"))
                            {
                                System.out.println("Escribe la cantidad de moneda peseta: ");
                                valor = sc.nextDouble();

                                resultado = valor / 166.386;
                                System.out.println(df.format(resultado) + " €");
                            }
                        }
                }
                break;

            case 4:
                {
                    int x, y, z;

                    System.out.println("Escribe primer número: ");
                    x = sc.nextInt();
                    System.out.println("Escribe segundo número: ");
                    y = sc.nextInt();
                    System.out.println("Escribe tercer número: ");
                    z = sc.nextInt();

                    if(x < y && y < z)
                    {
                        System.out.println("Los números están ordenados de menor a mayor");
                    }
                    else
                        {
                            System.out.println("Los números no están ordenados de menor a mayor");
                        }
                }
                break;

            case 5:
                {
                    int x, y, z;

                    System.out.println("Escribe un número: ");
                    x = sc.nextInt();
                    System.out.println("Escribe un número: ");
                    y = sc.nextInt();
                    System.out.println("Escribe un número: ");
                    z = sc.nextInt();

                    if((x == y - 1) && (y == z - 1))
                    {
                        System.out.println("Los números están ordenados de menor a mayor y son consecutivos");
                    }
                    else
                        {
                            if(x < y && y < z)
                            {
                                System.out.println("Los números están ordenados de menor a mayor");
                            }
                            else
                                {
                                    System.out.println("Los números no están ordenados de menor a mayor ni son consecutivos");
                                }
                        }
                }
                break;

            case 6:
                {
                    int n;
                    System.out.println("Escribe un número: ");
                    n = sc.nextInt();

                    if(n > -10 && n < 10)
                    {
                        System.out.println("1");
                    }
                    else
                        {
                            if(n > -100 && n < 100)
                            {
                                System.out.println("2");
                            }
                            else
                                {
                                    if(n > -1000 && n < 1000)
                                    {
                                        System.out.println("3");
                                    }
                                    else
                                        {
                                            if(n > -10000 && n < 10000)
                                            {
                                                System.out.println("4");
                                            }
                                            else
                                                {
                                                    if(n > -100000 && n < 100000)
                                                    {
                                                        System.out.println("5");
                                                    }
                                                }
                                        }
                                }
                        }
                }
                break;

            case 7:
                {
                    //Fórmula x = -b + sqrt(b^2 - 4ac) / 2a
                    double a, b, c, raiz, x1, x2;

                    //Leemos los datos
                    System.out.println("Valor de a: ");
                    a = sc.nextDouble();
                    System.out.println("Valor de b: ");
                    b = sc.nextDouble();
                    System.out.println("Valor de c:");
                    c = sc.nextDouble();

                    //Calculamos lo que está dentro de la raíz cuadrada
                    raiz = (b * b) - (4 * a * c);

                    //Dos soluciones
                    if(raiz > 0)
                    {
                        x1 = (-b + Math.sqrt(raiz)) / (2 * a);
                        x2 = (-b - Math.sqrt(raiz)) / (2 * a);
                        System.out.println("Las dos soluciones son " + x1 + " y " + x2);
                    }
                    else
                        {
                            System.out.println("¡NO TIENE SOLUCIÓN!");
                        }
                }
                break;

            case 8:
                {
                    int a, b, c;

                    //Leemos los datos
                    System.out.println("Escribe un número");
                    a = sc.nextInt();
                    System.out.println("Escribe un número");
                    b = sc.nextInt();
                    System.out.println("Escribe un número");
                    c = sc.nextInt();

                    //Algoritmo
                    if(a < b && b < c)
                    {
                        System.out.println("Menor = " + a);
                        System.out.println("Mediano = " + b);
                        System.out.println("Mayor = " + c);
                    }
                    else
                        {
                            if(a < c && c < b)
                            {
                                System.out.println("Menor = " + a);
                                System.out.println("Mediano = " + c);
                                System.out.println("Mayor = " + b);
                            }
                            else
                                {
                                    if(b < a && a < c)
                                    {
                                        System.out.println("Menor = " + b);
                                        System.out.println("Mediano = " + a);
                                        System.out.println("Mayor = " + c);
                                    }
                                    else
                                        {
                                            if(b < c && c < a)
                                            {
                                                System.out.println("Menor = " + b);
                                                System.out.println("Mediano = " + c);
                                                System.out.println("Mayor = " + a);
                                            }
                                            else
                                                {
                                                    if(c < a && a < b)
                                                    {
                                                        System.out.println("Menor = " + c);
                                                        System.out.println("Mediano = " + a);
                                                        System.out.println("Mayor = " + b);
                                                    }
                                                    else
                                                        {
                                                            if(c < b && b < a)
                                                            {
                                                                System.out.println("Menor = " + c);
                                                                System.out.println("Mediano = " + b);
                                                                System.out.println("Mayor = " + a);
                                                            }
                                                        }
                                                }
                                        }
                                }
                        }

                }
                break;

        }
    }
}

