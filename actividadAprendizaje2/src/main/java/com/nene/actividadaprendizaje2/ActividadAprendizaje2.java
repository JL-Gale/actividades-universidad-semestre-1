
package com.nene.actividadaprendizaje2;

import java.util.Random;
import java.util.Scanner;

public class ActividadAprendizaje2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*1. Realizar un programa que Ingrese los datos del deportista e imprima, si
        es acto o no para poder ejercer el deporte, con las siguientes
        condiciones.
        a. Que sea mayor de 15 años
        b. Que sea colombiano
        c. Que tengo un peso entre 60 y 90 kilos*/
        
        /*System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su nacionalidad: ");
        String nacionalidad = sc.nextLine();
        
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        
        if (edad > 15 && nacionalidad.equals("colombiano") && peso > 60 && peso < 90) {
            System.out.println("Es acto");
        } else {
            System.out.println("No es acto");
        }*/
        
 
        /*2. Realice un programa que ingrese un Número de 3 dígitos. Lo divide en
        3 dígitos independiente, e imprimir cual no es ni mayor ni menor de los
        dígitos.
        N=371; el Numero del medio es 3.*/
        
        /*System.out.println("Ingrese un numero de tres de digitos: ");
        int numero = sc.nextInt();
        
        int num1, num2, num3, aux = 0, aux2; 
        
        num3 = numero%10;
        
        numero = numero/10;
        num2 = numero%10;
        
        numero = numero/10;
        num1 = numero%10;
        
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
                System.out.println("El numero del medio es: "+num1);
            } else {
                if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
                    System.out.println("El numero del medio es: "+num2);
                } else {
                    if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
                        System.out.println("El numero del medio es: "+num2);
                    }
                }
            }
        } else {  
            System.out.println("Los numeros deben ser diferentes");
        }*/
        

        /*3. Realice un Programa, Digitado 5 Ventas en el Almacén XYZ Calcular:
        • ¿Cuántas ventas Fueron Mayores 1.000.000?
        • ¿El Promedio de las Ventas?
        • ¿Cuál Fue la Mayor Venta?
        • ¿Cuál Fue la Menor Venta?*/
        
        /*int venta1, venta2, venta3, venta4, venta5, promedio, ventaMayor, ventaMenor, ventasMayores = 0;
        System.out.println("Ingrese la primera venta: ");
        venta1 = sc.nextInt();
        if (venta1 > 1000000) {
            ventasMayores++;
        }
        ventaMayor = venta1;
        ventaMenor = venta1;
        System.out.println("Ingrese la segunta venta: ");
        venta2 = sc.nextInt();
        if (venta2 > 1000000) {
            ventasMayores++;
        }
        if (ventaMayor<venta2) {
            ventaMayor = venta2;
        }
        if (ventaMenor>venta2) {
            ventaMenor = venta2;
        }
        System.out.println("Ingrese la tercera venta: ");
        venta3 = sc.nextInt();
        if (venta3 > 1000000) {
            ventasMayores++;
        }
            if (ventaMayor<venta3) {
            ventaMayor = venta3;
        }
        if (ventaMenor>venta3) {
            ventaMenor = venta3;
        }
        System.out.println("Ingrese la cuarta venta: ");
        venta4 = sc.nextInt();
        if (venta4 > 1000000) {
            ventasMayores++;
        }
        if (ventaMayor<venta4) {
            ventaMayor = venta4;
        }
        if (ventaMenor>venta4) {
            ventaMenor = venta4;
        }
        System.out.println("Ingrese la quinta venta: ");
        venta5 = sc.nextInt();
        if (venta5 > 1000000) {
            ventasMayores++;
        }
        if (ventaMayor<venta5) {
            ventaMayor = venta5;
        }
        if (ventaMenor>venta5) {
            ventaMenor = venta5;
        }
        
        System.out.println("El numero ventas mayores de 1,000,000 fueron: "+ ventasMayores);
        
        promedio = (venta1+venta2+venta3+venta4+venta5)/5;
        System.out.println("El promedio de las ventas es de: "+promedio);
        
        System.out.println("La venta mayor es de: "+ventaMayor);
        System.out.println("La venta menor es de: "+ventaMenor);*/
               

        
        /*4. Imprimir el numero digitado del Rango 1 a 15 en asteriscos,
        solo acepta números positivos:
        Ejemplo si el numero digitado es 7, imprime ******* (7 asteriscos)*/
        
        /*int numero;
        boolean validacion = false;
        
        do {            
            System.out.println("Ingrese el numero de asteriscos que desea: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 15);
        
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }*/
        
        
        /*5. Digitado dos Dados, dado1 y dado2, utilizando una función (Aleatoria),
        si la cara de los dados cae dado1=6 y dado=4, imprimir eres un
        afortunado, ¡sino cumple con la condición inténtalo de nuevo!*/
        
        /*Random ran = new Random();
        int dado1 = ran.nextInt(1,6);
        int dado2 = ran.nextInt(1,6);
        
        if (dado1 == 6 && dado2 == 4) {
            System.out.println("Eres un suertudo");
            System.out.println("Has sacado: "+dado1+" y "+dado2);
        } else {
            System.out.println("Intentalo de nuevo");
            System.out.println("Has sacado: "+dado1+" y "+dado2);
        }*/
        
         /*6. Una empresa Mypime, paga a sus vendedores mediante, comisiones,
                los vendedores reciben $250.000 pesos por semana, más el 9% de sus
                ventas durante esa semana, calcule cuanto es valor por pagar por mes
                vendedor, el número de vendedores son 5.*/
         
         /*int ven1, ven2, ven3, ven4, ven5;
         
         System.out.println("Porfavor ingrese el valor de las ventas del vendero 1");
         ven1 = sc.nextInt();
         ven1 = (int) (ven1 * 0.09);
         ven1 = ven1 + 250000;
        
                 
         System.out.println("Porfavor ingrese el valor de las ventas del vendero 2");
         ven2 = sc.nextInt();
         ven2 = (int) (ven2 * 0.09);
         ven2 = ven2 + 250000;
         
         System.out.println("Porfavor ingrese el valor de las ventas del vendero 3");
         ven3 = sc.nextInt();
         ven3 = (int) (ven3 * 0.09);
         ven3 = ven3 + 250000;
         
         System.out.println("Porfavor ingrese el valor de las ventas del vendero 4");
         ven4 = sc.nextInt();
         ven4 = (int) (ven4 * 0.09);
         ven4 = ven4 + 250000;
         
         System.out.println("Porfavor ingrese el valor de las ventas del vendero 5");
         ven5 = sc.nextInt();
         ven1 = (int) (ven1 * 0.09);
         ven1 = ven1 + 250000;/*
         
         
         
         
         
         
         /*7. Realizar un algoritmo que recibido por teclado tres lados de un triángulo
            y determine si el triángulo es Isósceles, Equilátero o Escaleno.
            */
         
         /*int a, b, c;
         
         System.out.println("Ingrese el valor de lado 1 del triangiulo");
         a = sc.nextInt();
         System.out.println("Ingrese el valor de lado 2 del triangiulo");
         b = sc.nextInt();
         System.out.println("Ingrese el valor de lado 3 del triangiulo");
         c = sc.nextInt();

        if (a == b && a == c && b == c) {
            System.out.println("El triangulo es equilatero");
        } else {
                 if (a == b || a == c || b == c) {
             System.out.println("El triangulo es isosceles");
                 }
                 if (a != b && a != c && b != c) {
            System.out.println("El triangulo es escaleno");
                }
        }*/
        
        /*8. Convertir cuantas horas, minutos y segundos hay en N minutos digitados
        Ejemplo:140 minutos son 2 Horas,20 minutos, 0 segundos*/
        
        /*int minutos, horas = 0, segundos;
        
        System.out.println("Ingrese la cantidad de minutos:");
        minutos = sc.nextInt();
        
        segundos = minutos * 60;
        minutos = 0;
        while (segundos >= 60) {            
            minutos++;
            segundos = segundos - 60;
        }
        
        while (minutos >= 60) {            
            horas++;
            minutos = minutos - 60;
        }
        
        System.out.println(horas+" : "+minutos+" : "+segundos);*/
        
        /*9. Crear un algoritmo que lea cantidades y precios y al final indique el total
        de la factura. Primero se pregunta: Introduzca la cantidad vendida tras lo
        cual el usuario introducirá un número entero positivo. Después se
        pregunta: Introduzca el precio que será un número decimal positivo. La
        lectura termina cuando en la cantidad se introduzca un cero. Si es así se
        escribirá el total.*/
        
        /*int cantidad;
        double precio, precioTotal = 0;
        
        do {            
            System.out.println("Introduzca la cantidad vendida: ");
             cantidad = sc.nextInt();
               if (cantidad != 0) {
                 System.out.println("Introduzca el precio");
                 precio = sc.nextDouble();
                 precioTotal = (cantidad*precio) + precioTotal;
            }   
        } while (cantidad != 0);
        
        System.out.println("El precio total es de: "+precioTotal);*/
        
        /*10. Crear un algoritmo para calcular los salarios semanales de unos
        empleados a los que se les paga $15.000 por hora si éstas no superan
        las 35 horas. Cada hora por encima de 35 se considerará extra y se paga
        a $27.000. El programa pide las horas del trabajador y devuelve el salario
        que se le debe pagar. Además el programa debe preguntar si deseamos
        calcular otro salario, si es así el programa se vuelve a repetir.*/
        
        /*int horasTrabajadas, salario =0, aux;
        boolean validacion = true;
        
        while (validacion) {            
            System.out.println("Ingrese el numero de horas trabajadas: ");
            horasTrabajadas = sc.nextInt();
            
            if (horasTrabajadas > 35) {
               salario = 35 * 15000;
               aux = horasTrabajadas;
               aux = aux - 35;
               salario = (aux*27000)+salario;
            }
            
            if (horasTrabajadas <= 35) {
                salario = horasTrabajadas * 15000;
            }
            
            System.out.println("El salario total es: "+salario);
            
            System.out.println("Deseas calcular otro salario\n"+"1. si\n"+"2. no");
            int vali = sc.nextInt();
            if (vali == 2) {
                validacion = false;
            }
        }*/
        
        
        /*11. Crear un algoritmo que muestre un menú como este:
        1) Salir
        2) Sumatorio
        3) Factorial
        Tras mostrar el menú, el algoritmo debe leer un número del 1 al tres si se
        elige 1, el programa acaba. Si se elige 2 se calcula el sumatorio del
        número, si se elige 3 se calcula el factorial (en ambos casos el algoritmo
        pedirá escribir el número sobre el que se calcula el sumatorio o el
        factorial). Tras calcular el sumatorio o el factorial e indicar el resultado, el
        algoritmo volverá a mostrar el menú y así sucesivamente.*/

        /*int num, menu, factorial = 1, sumatoria = 0;
        boolean validacion = true;
        while (validacion) {

            
            System.out.println("1) salir\n"+"2) sumatorio\n"+"3) factorial");
            menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    validacion = false;
                    break;
                case 2:
                    System.out.println("Ingrese un numero");
                    num = sc.nextInt();
                    for (int i = 1; i <= num; i++) {
                        sumatoria = sumatoria + i;
                    }
                    System.out.println("La sumatoria es: "+sumatoria);
                    break;
                 case 3:
                     System.out.println("Ingrese un numero");
                     num = sc.nextInt();
                     for (int i = 1; i <= num; i++) {
                         factorial = factorial * i;
                     }
                     System.out.println("El factorial es: "+factorial);
                     break;
                    
                default:
                    System.out.println("Opcion equivocada");
                    break;
            }
            
        }*/ 
        
        /*Desarrollar el algoritmo para el Juego de Picas y Fijas. El juego consiste
        en tratar de adivinar un número en la menor cantidad de intentos. En cada
        intento, el jugador dice 4 dígitos (no repetidos) y el oponente da pistas de
        cuántos aciertos tuvo, sin indicarle cuales fueron, de la siguiente forma:
        Si algún dígito que dice el jugador se encuentra dentro del número a
        adivinar, pero no está en la posición correcta, se llama PICA. Si el dígito
        se encuentra en la posición adecuada, se llama FIJA. Así, las pistas serán
        la cantidad de PICAS y la cantidad de FIJAS que se tienen. El juego
        termina cuando algún jugador tiene 4 FIJAS (4 dígitos en el orden
        adecuado).*/
        

        /*int[] numeroAdivinar = generarNumeroAleatorio();
        int intentos = 0;

        System.out.println("Bienvenido al juego de Picas y Fijas. Debes adivinar un número de 4 dígitos.");

        while (true) {
            System.out.print("Ingresa tu intento de 4 dígitos (sin repetir): ");
            int[] intento = leerIntento(sc);

            int picas = contarPicas(numeroAdivinar, intento);
            int fijas = contarFijas(numeroAdivinar, intento);
            intentos++;

            System.out.println("Picas: " + picas);
            System.out.println("Fijas: " + fijas);

            if (fijas == 4) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            }
        }
    }

    public static int[] generarNumeroAleatorio() {
        Random random = new Random();
        int[] numero = new int[4];
        boolean[] usados = new boolean[10];

        for (int i = 0; i < 4; i++) {
            int digito;
            do {
                digito = random.nextInt(10);
            } while (usados[digito]);
            numero[i] = digito;
            usados[digito] = true;
        }

        return numero;
    }

    public static int[] leerIntento(Scanner scanner) {
        int[] intento = new int[4];
        String input = scanner.next();

        if (input.length() != 4) {
            System.out.println("Debes ingresar 4 dígitos.");
            return leerIntento(scanner);
        }

        for (int i = 0; i < 4; i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("Ingresa solo dígitos.");
                return leerIntento(scanner);
            }
            intento[i] = c - '0';
        }

        return intento;
    }

    public static int contarPicas(int[] numeroAdivinar, int[] intento) {
        int picas = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (intento[i] == numeroAdivinar[j] && i != j) {
                    picas++;
                }
            }
        }
        return picas;
    }

    public static int contarFijas(int[] numeroAdivinar, int[] intento) {
        int fijas = 0;
        for (int i = 0; i < 4; i++) {
            if (intento[i] == numeroAdivinar[i]) {
                fijas++;
            }
        }
        return fijas;
    }*/
    
        /*13. Hacer un algoritmo que permita determinar cuánto tiempo tarda en
        llenarse una Jarra tomando en cuenta que la jarra tiene una capacidad de
        1000 cc, cada segundo la Jarra recibe 7 cc y cada cinco segundo la Jarra
        pierde el 5% de su contenido.*/
        
 
        /*int capacidadJarra = 1000; 
        double contenidoJarra = 0; 
        int tiempo = 0; 
        
        while (contenidoJarra < capacidadJarra) {            
            contenidoJarra = contenidoJarra+7;
            tiempo++;
        }

        

        System.out.println("La jarra se llenó en " + tiempo + " segundos.");*/
        
        /*14. Implementar un algoritmo que seleccione en forma aleatoria un número
        entre 1 y 1000 y el jugador debe acertarlo. En cada intento, el jugador
        propondrá un número y el algoritmo le informara si es mayor o menor. El
        juego termina cuando el número sea encontrado. Es necesario llevar un*/
        

        /*Random random = new Random();
       

        int numeroAdivinar = random.nextInt(1000) + 1; // Genera un número aleatorio entre 1 y 1000
        int intentos = 0;
        int numeroJugador;

        System.out.println("Bienvenido al juego de adivinar el número entre 1 y 1000.");

        do {
            System.out.print("Ingresa tu número: ");
            numeroJugador = sc.nextInt();
            intentos++;

            if (numeroJugador < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else if (numeroJugador > numeroAdivinar) {
                System.out.println("El número es menor.");
            }
        } while (numeroJugador != numeroAdivinar);

        if (intentos >= 1 && intentos <= 3) {
            System.out.println("¡Suertudo!");
        } else if (intentos >= 4 && intentos <= 6) {
            System.out.println("¡Genio!");
        } else if (intentos >= 7 && intentos <= 8) {
            System.out.println("¡Se puede mejorar!");
        } else {
            System.out.println("¡No eres muy inteligente!");
        }

        System.out.println("Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");*/


    
        /*15. Simular la división usando solamente restas. Dados dos números
        enteros mayores de uno, desarrollar un algoritmo calcule el cociente y el
        residuo usando sólo restas. Método: Restar el dividendo del divisor
        hasta obtener un resultado menor que el divisor, este resultado es el
        residuo, y el número de restas realizadas es el cociente.*/
        
        /*System.out.print("Ingrese el dividendo (mayor que 1): ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (mayor que 1): ");
        int divisor = sc.nextInt();

        if (dividendo <= 1 || divisor <= 1) {
            System.out.println("Los números deben ser mayores que 1.");
        } else {
            int cociente = 0;
            int residuo = dividendo;

            while (residuo >= divisor) {
                residuo -= divisor;
                cociente++;
            }

            System.out.println("Cociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        }*/
  
        /*16. Desarrolle una clase ejecutable que convierta un número entero en otro
        número entero que será el primero pero con las cifras que lo forman
        escritas al revés. Ejemplo: convertirá el número entero 1842 en el 2481.
        */
        
        /*System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int numeroInvertido = invertirNumero(numero);

        System.out.println("Número invertido: " + numeroInvertido);
    }

    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Agregar el dígito al número invertido
            numero = numero / 10; // Eliminar el último dígito
        }

        return numeroInvertido;*/
        
        /*17. Desarrolle un algoritmo que calcule el cuadrado de un número haciendo
        sólo sumas. Ayuda: el cuadrado de un número n es la suma de los n
        primeros números impares. Ejemplo: 32=1+3+5=9.*/
        
        /*System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        int cuadrado = 0;
        int impar = 1;

        for (int i = 1; i <= n; i++) {
            cuadrado = cuadrado + impar;
            impar = impar + 2;
        }

        System.out.println("El cuadrado de " + n + " es " + cuadrado);*/
        
        /*18. En una tienda de descuento las personas que van a pagar el valor de sus
        compra llegan a la caja y sacan una bolita de color, que les dirá el
        descuento que tendrán sobre el total de su compra. Determinar la
        cantidad que pagara cada cliente desde que la tienda abre hasta que
        cierra. Se sabe que si el color de la bolita es rojo, el cliente obtendrá un
        40% de descuento; si es amarillo un 25% y si es blanco no obtendrá
        descuento.*/
        
        /*int compra, color, valortotal = 0; 
        double descuento;
        
        
        System.out.println("Ingrese el valor de la compra del cliente");
        compra = sc.nextInt();
        
        Random random = new Random();
        color = random.nextInt(3);

        if (color == 0) {
            descuento = compra * 0.40;
            valortotal = (int) (compra - descuento);
            System.out.println("La bolita que saco el coliente fue la roja y tuvo un descuento del 40%");
            System.out.println("El total a pagar es de: "+valortotal);
            
        } else if (color == 1) {
            descuento = compra * 0.25;
            valortotal = (int) (compra - descuento);
            System.out.println("La bolita que saco el coliente fue la amarilla y tuvo un descuento del 25%");
            System.out.println("El total a pagar es de: "+valortotal);
        } else {
            descuento = compra * 0.0;
            valortotal = (int) (compra - descuento);
            System.out.println("La bolita que saco el coliente fue la blanca y tuvo un descuento del 0%");
            System.out.println("El total a pagar es de: "+valortotal);
        }*/
        
        /*19. Realizar un programa que imprima la sumatoria de los N términos de la
        serie (11+22+33+44+55+…)
        */
        
        /*System.out.print("Ingrese el valor de N: ");
        int N = sc.nextInt();

        int suma = 0;
        int termino = 11;

        for (int i = 0; i < N; i++) {
            suma += termino;
            termino += 11;
        }

        System.out.println("La sumatoria de los primeros " + N + " términos de la serie es: " + suma);*/

        /*Desarrollar un algoritmo que lea por teclado un número y determina si el
        numero ingresado es par o impar. */
        
    
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }*/
        
        /*20. Desarrollar un algoritmo que ingresado el número de horas trabajadas
            de un empleado y el valor de hora calcule el salario neto a pagar.
            Teniendo en cuenta lo siguiente: que si el número de horas trabajadas
            es mayor a 40, el resto se determinan horas extras y al valor de la hora
            de las adicionales se le suma $2000 pesos. El valor de la rete fuente a
            aplicar es del 3% sino tiene horas extras y del 4.5% si tiene horas
            extras. */
       
        /*System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();
        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = sc.nextDouble();

        double salarioBase = 0;
        double horasExtras = 0;
        double valorHoraExtra = valorHora + 2000;  
     
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            horasTrabajadas = 40;
        }
 
        salarioBase = horasTrabajadas * valorHora;
 
        double salarioTotal = salarioBase + (horasExtras * valorHoraExtra);

        double retencion = (horasExtras > 0) ? salarioTotal * 0.045 : salarioTotal * 0.03;

        double salarioNeto = salarioTotal - retencion;

        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Salario con horas extras: $" + salarioTotal);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario neto a pagar: $" + salarioNeto);*/
        
        /*22. Desarrollar un algoritmo que permita calcular e imprimir en pantalla los
        números primos que están comprendidos entre 1 y 100. */
        
        /*System.out.println("1");
        
        for (int i = 1; i < 100; i++) {
            int cont = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
        }*/
        
        /*23. Desarrollar un algoritmo que permita ingresar un número entero e
        imprima por pantalla la conversión de ese número en Binario. */
        
        int numero, exp, digito;
        double binario;
        
        do{ 
            System.out.print("Introduce un numero entero >= 0: ");                                                
            numero = sc.nextInt();
        }while(numero < 0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);

    }   
}
