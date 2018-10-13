package com.company;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
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

    static double PulgadasACentimetros(double pulgadas)
    {
        // 1 pulgada = 2.54 cm

        double cm = pulgadas * 2.54;
        return cm;
    }

    static double CentimetrosAPulgadas(double cm)
    {
        // 1 pulgada = 2.54 cm

        double pulgadas = cm / 2.54;

        return pulgadas;
    }

    static String NotaEnTexto(double nota)
    {
        String calificacion = "";

        if(nota >= 0 && nota < 5)
        {
            calificacion = "Suspenso";
        }
        else
        {
            if(nota >= 5 && nota < 6)
            {
                calificacion = "Suficiente";
            }
            else
            {
                if(nota >= 6 && nota < 7)
                {
                    calificacion = "Bien";
                }
                else
                {
                    if(nota >= 7 && nota < 9)
                    {
                        calificacion = "Notable";
                    }
                    else
                    {
                        if(nota >= 9 && nota <= 10)
                        {
                            calificacion = "Sobresaliente";
                        }
                        else
                        {
                            System.out.println("NOTA NO VÁLIDA");
                        }
                    }
                }
            }
        }
        return calificacion;
    }

    static void LeeNatural(int n)
    {
        Scanner natural = new Scanner(System.in);
        while(n <= 0)
        {
            System.out.print("Escribe un número: ");
            n = natural.nextInt();
        }
    }

    static void LeeNumero(int a, int b)
    {
        Scanner leenumero = new Scanner(System.in);
        int n;
        System.out.println("Escribe un número entre " + a + " y " + b);
        n = leenumero.nextInt();

        while(n < a || n > b)
        {
            System.out.println("El número se sale del rango." + '\n' +
                    "Vuelva a escribir otro por favor.");
            n = leenumero.nextInt();
        }
    }

    static int Elevado(int a, int b)
    {
        int resultado = 1;
        for(int i = 1; i <= b; i++)
        {
            resultado = resultado * a;

        }
        return resultado;
    }

    static int Factorial(int n)
    {
        int factorial = 1;
        int i;
        for(i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

    static int DiasMes(int mes)
    {
        int totaldias;
        switch (mes)
        {
            case 1: totaldias = 31; break;
            case 2: totaldias = 28; break;
            case 3: totaldias = 31; break;
            case 4: totaldias = 30; break;
            case 5: totaldias = 31; break;
            case 6: totaldias = 30; break;
            case 7: totaldias = 31; break;
            case 8: totaldias = 31; break;
            case 9: totaldias = 30; break;
            case 10: totaldias = 31; break;
            case 11: totaldias = 30; break;
            case 12: totaldias = 31; break;
            default: totaldias = 32; break;
        }
        return totaldias;
    }

    static int DiasMes2(int mes, int anio)
    {
        int dias;

        if(Bisiesto(anio) && mes == 2)
        {
            dias = 29;
        }
        else
        {
            dias = DiasMes(mes);
        }
        return dias;
    }

    static int DiasTranscurridos(int dia, int mes, int anio)
    {
        //Función que calcula los días transcurridos desde primero de año hasta la fecha que se pase por parámetro

        int diaHoy = 0;
        int i;
        for(i = 1; i < mes; i++)
        {
            diaHoy = DiasMes2(i, anio);
        }
        diaHoy = diaHoy + dia;
        return diaHoy;
    }

    static int DiasTranscurridos1980(int dia, int mes, int anio)
    {
        int sumaAnios = 0;  //Variable que contendrá cantidad en días de los años correspondientes
        int i;

        for(i = 1980; i < anio; i++)
        {
            if(Bisiesto(anio))
            {
                sumaAnios = sumaAnios + 366;
            }
            else
            {
                sumaAnios = sumaAnios + 365;
            }
        }
        sumaAnios = sumaAnios + DiasTranscurridos(dia, mes, anio);
        return sumaAnios;
    }

    static int DiasEntreFechas(int dia1, int mes1, int anio1, int dia2, int mes2, int anio2)
    {
        int entreFechas;
        entreFechas = DiasTranscurridos1980(dia2, mes2, anio2) - DiasTranscurridos1980(dia1, mes1, anio1);
        return entreFechas;
    }

    static int HorasASegundos(int hora, int minuto, int segundo)
    {
        int totalSegundos;
        int horasAsegundos = (hora * 60) * 60;
        int minutosAsegundos = minuto * 60;

        totalSegundos = horasAsegundos + minutosAsegundos + segundo;
        return totalSegundos;
    }

    static void EscribeHoraBonita(int h, int m, int s)
    {
        if(h < 10)
        {
            System.out.print("0" + h + ":");
        }
        else
        {
            System.out.print(h + ":");
        }
        if(m < 10)
        {
            System.out.print("0" + m + ":");
        }
        else
        {
            System.out.print(m + ":");
        }
        if(s < 10)
        {
            System.out.print("0" + s);
        }
        else
        {
            System.out.print(s);
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
        System.out.println("[5] Signo");
        System.out.println("[6] Max");
        System.out.println("[7] Min");
        System.out.println("[8] MCD");
        System.out.println("[9] MCM");
        System.out.println("[10] Primo");
        System.out.println("[11] AreaTriangulo");
        System.out.println("[12] PulgadasACentimetros");
        System.out.println("[13] CentímetrosAPulgadas");
        System.out.println("[14] NotaEnTexto");
        System.out.println("[15] LeeNatural");
        System.out.println("[16] LeeNumero");
        System.out.println("[17] Elevado");
        System.out.println("[18] Factorial");
        System.out.println("[19] Lee3");
        System.out.println("[20] Inc");
        System.out.println("[21] ResolucionCamara");
        System.out.println("[22] DiasMes");
        System.out.println("[23] DiasMes2");
        System.out.println("[24] DiasTranscurridos");
        System.out.println("[25] DiasTranscurridos1980");
        System.out.println("[26] DiasEntreFechas");
        System.out.println("[27] HorasASegundos");
        System.out.println("[28] EscribeHoraBonita");
        System.out.println("[29] EscribeSegundosBonitos");
        System.out.println("[30] SegundosTrasncurridos");
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

            case 12:
            {
                //Escribe una función “PulgadasACentimetros” a la que le pases un valor en pulgadas (de
                //tipo double) y te devuelva el valor en centímetros. Haz también la función
                //“CentímetrosAPulgadas”.

                double pulgadas, cm;
                System.out.print("Escribe pulgadas: ");
                pulgadas = sc.nextDouble();

                cm = PulgadasACentimetros(pulgadas);
                System.out.println(cm);

            }
            break;

            case 13:
            {
                //Función que realiza la conversión de centímetros a pulgadas

                //Instanciamos un objeto de la clase DecimalFormat para darle tan solo 2 decimales al resultado

                DecimalFormat df = new DecimalFormat("#.00");

                double cm, pulgadas;
                System.out.print("Escribe cm: ");
                cm = sc.nextDouble();

                pulgadas = CentimetrosAPulgadas(cm);
                System.out.println(df.format(pulgadas));
            }
            break;

            case 14:
            {
                //Escribe una función “NotaEnTexto” a la que le pasamos la nota de un alumno como un
                //double y nos devolverá la calificación en formato texto (“aprobado”, “suficiente”, etc.).

                String resultado;
                double nota;
                System.out.print("Escribe nota del alumno: ");
                nota = sc.nextDouble();

                resultado = NotaEnTexto(nota);
                System.out.println(resultado);

            }
            break;

            case 15:
            {
                // Escribe una función “LeeNatural” que nos lea un número natural desde el teclado. La
                //función nos pondrá un texto en el que se nos indica que introduzcamos un número y
                //después nos leerá el número del teclado. Si el número introducido es 0 o negativo, nos
                //volverá a pedir otro número.

                int n;
                System.out.print("Escribe un número: ");
                n = sc.nextInt();

                LeeNatural(n);
            }

            case 16:
            {
                //Escribe una función “LeeNúmero” a la que le pasas dos parámetros (a y b) y nos lee del
                //teclado un número comprendido entre a y b (ambos incluidos). Si el número no es
                //correcto, te vuelve a pedir que lo introduzcas.

                int a, b;
                a = 10;
                b = 20;

                LeeNumero(a, b);
            }
            break;

            case 17:
            {
                //Escribe una función “Elevado” a la que le pasas dos números enteros (a y b) y te
                //devuelve el valor de “a” elevado a “b” (sin usar la función Math.Pow) (o sea,
                //multiplicando un número muchas veces).

                int a, b, resultado;
                System.out.print("Escribe número: ");
                a = sc.nextInt();
                System.out.print("Escribe exponente: ");
                b = sc.nextInt();

                resultado = Elevado(a, b);
                System.out.println(resultado);
            }
            break;

            case 18:
            {
                //Escribe una función “Factorial” que nos calcule el factorial de un número entero.
                //Ejemplo:  5! = 5 x 4 x 3 x 2 x 1 --> 120

                int n, factorial;
                System.out.print("Escribe un número para calcular su factorial: ");
                n = sc.nextInt();

                factorial = Factorial(n);
                System.out.println(n + "! factorial = " + factorial);

            }
            break;

            case 19:
            {
                //Escribe una función “Lee3” que te lea tres números del teclado. Para ello habrá que
                //pasarle tres parámetros (a, b, c) por referencia.
            }
            break;

            case 20:
            {
                //Escribe una función “Inc” que nos incremente el valor de una variable. Para ello, le
                //pasaremos la variable por referencia para que nos la pueda incrementar. Escribe
                //también la función “Dec”.
            }
            break;

            case 21:
            {
                //Escribe una función “ResolucionCamara” a la que le pasas el número de MegaPixels
                //que tiene una cámara digital (puede ser un double) y nos dice cuál es la resolución
                //máxima de las fotos que hace la cámara. Los valores los devolverá en dos variables que
                //le pasamos por referencia (x, y).
            }
            break;

            case 22:
            {
                //Escribe  una  función  “DiasMes”,  a  la  que  le  pasamos  un  mes  (en  formato  numérico
                //1=Enero, 2=Febrero, etc.)y nos dice el número de días que tiene ese mes.

                int mes, dias;
                System.out.println("Escribe el mes en formato numérico (Enero=1, Febrero=2, etc...");
                mes = sc.nextInt();

                dias = DiasMes(mes);
                System.out.println("El mes " + mes + " tiene " + dias + " dias.");
            }
            break;

            case 23:
            {
                // Debido a que en los años bisiestos el mes de Febrero tiene 29 días en lugar de 28,
                //necesitaremos  también  dar  el  año  para  conseguir  el  resultado  correcto.  Escribe  la
                //función  “DiasMes2”  a  la  que  le  pasas  un  mes  y  un  año  (ambos  enteros)  y  te  dice
                //cuántos  días  tiene  ese  mes,  teniendo  en  cuenta  si  el  año  es  bisiesto  o  no  (NOTA:
                //Podéis usar la función “Bisiesto” que hicimos con anterioridad).

                int mes, anio, resultado;

                System.out.print("Escribe el mes: ");
                mes = sc.nextInt();
                System.out.print("Escribe el año: ");
                anio = sc.nextInt();

                resultado = DiasMes2(mes, anio);
                System.out.println(resultado);
            }
            break;

            case 24:
            {
                //Escribe  una  función  “DiasTranscurridos”  a  la que  le  pasamos  tres  enteros,  el día,  el
                //mes y el año, y nos dice cuántos días han pasado desde el inicio del año hasta ese día.
                //Así, el 1 de enero será el día 1 y el 31 de diciembre será el 365 ó 366 dependiendo de
                //si el año es bisiesto o no.

                int dias;
                int d, m, a;
                System.out.print("Escribe día: ");
                d = sc.nextInt();
                System.out.print("Escribe mes: ");
                m = sc.nextInt();
                System.out.print("Escribe año: ");
                a = sc.nextInt();

                dias = DiasTranscurridos(d, m, a);
                System.out.println("Fecha actual: ");
                System.out.println();
                System.out.println("Día = " + d);
                System.out.println("Mes = " + m);
                System.out.println("Año = " + a);
                System.out.println();
                System.out.println("Transcurren " + dias + " días desde la fecha indicada");

            }
            break;

            case 25:
            {
                //Escribe una función “DiasTranscurridos1980” a la que le pasamos un día, mes y año y
                //nos diga cuántos días han transcurrido desde el 01/01/1980 hasta ese día.

                int dia, mes, anio;
                int transcurridos;

                String d, h = "";

                System.out.print("Escribe día: ");
                dia = sc.nextInt();
                System.out.print("Escribe mes: ");
                mes = sc.nextInt();
                System.out.print("Escribe año: ");
                anio = sc.nextInt();

                transcurridos = DiasTranscurridos1980(dia, mes, anio);

                if(transcurridos == 1)
                {
                    h = "Ha";
                    d = "día";
                }
                else
                {
                    h = "Han";
                    d = "dias";
                }

                System.out.println(h + " transcurrido " + transcurridos + " " + d + " desde 1980");

            }
            break;

            case 26:
            {
                //Escribe una función “DiasEntreFechas” a la que le pasamos 6 enteros. Un día, mes y
                //año y otro día, mes y año, y nos dice cuántos días han pasado entre ambas fechas.

                int dia1, mes1, anio1, dia2, mes2, anio2;
                int entreFechas;

                System.out.println("PRIMERA FECHA (desde...): ");
                System.out.print("Día: ");
                dia1 = sc.nextInt();
                System.out.print("Mes: ");
                mes1 = sc.nextInt();
                System.out.print("Año: ");
                anio1 = sc.nextInt();

                System.out.println("SEGUNDA FECHA (hasta....): ");
                System.out.print("Día: ");
                dia2 = sc.nextInt();
                System.out.print("Mes: ");
                mes2 = sc.nextInt();
                System.out.print("Año: ");
                anio2 = sc.nextInt();

                entreFechas = DiasEntreFechas(dia1, mes1, anio1, dia2, mes2, anio2);
                System.out.println("Total de días entre fechas = " + entreFechas);
            }
            break;

            case 27:
            {
                //Escribe una función “HoraASegundos” a la que le pasas 3 parámetros enteros (hora,
                //minutos y segundos) y te devuelve el total de segundos.

                int h, m, s, totalSegundos;
                System.out.print("Horas: ");
                h = sc.nextInt();
                System.out.print("Minutos: ");
                m = sc.nextInt();
                System.out.print("Segundos: ");
                s = sc.nextInt();

                totalSegundos = HorasASegundos(h, m, s);
                System.out.print("Total segundos = " + totalSegundos);
            }
            break;

            case 28:
            {
                //Escribe una función “EscribeHoraBonita” a la que le pasas tres parámetros (hora,
                //minutos y segundos) y te escribe por pantalla la hora en formato “HH:MM:SS”.

                int h, m, s;
                System.out.print("Horas: ");
                h = sc.nextInt();
                System.out.print("Minutos: ");
                m = sc.nextInt();
                System.out.print("Segundos: ");
                s = sc.nextInt();

                EscribeHoraBonita(h, m, s);
            }
            break;

            case 29:
            {
                //Escribe una función “EscribeSegundosBonito” a la que le pasas un parámetro que
                //corresponde al número de segundos y te escribe por pantalla la hora en formato
                //“HH:MM:SS”.
            }
            break;

            case 30:
            {
                // Escribe una función “SegundosTranscurridos” a la que le pasas 2 horas (en total, 6
                //parámetros: hora, minutos y segundos para cada una de las dos horas) y te dice
                //cuántos segundos han transcurrido entre una y otra.
            }
            break;
        }

    }
}
