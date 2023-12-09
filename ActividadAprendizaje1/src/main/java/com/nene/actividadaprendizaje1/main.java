
package com.nene.actividadaprendizaje1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //-------------------------------------------------------------------------------
         /*1. La empresa Prosegur tiene problema para calcular el salario neto a pagar a 
           un empleado, desarrollar una solución algoritmo que permita calcular e 
           imprimir el salario total, salario neto y el 5% del salario total como retención 
           en la fuente, ingresando por teclado el valor de la hora y el número de horas 
           trabajadas.*/
         
         /*int salarioNeto, valorHoras, horasTrabajadas;
         
         System.out.println("Ingrese el numero de horas trabajas");
         horasTrabajadas = sc.nextInt();
         System.out.println("Ingrese el valor de las horas");
         valorHoras = sc.nextInt();
         
         
         salarioNeto = horasTrabajadas * valorHoras;
        System.out.println("El salario total es: "+salarioNeto);
        
        salarioNeto = (salarioNeto/100)*95;
        System.out.println("El salario neto con descuento del 5% es: "+salarioNeto);*/
           
        //-------------------------------------------------------------------------------
        
        /*2. Un empleado gana en su salario total mensual $1.056.028, si trabajo un total 
        de 36 horas, calcular una solución algorítmica que permita imprimir cual es 
        el valor de una hora trabajada.*/
        
        /*float salario = 1056028;
        salario = salario/36;
        
        System.out.println("El valor de la hora trabajada es: "+salario);*/
        
        //-------------------------------------------------------------------------------
        
        /*3. Un estudiante de Ingeniería de Sistemas de la UdeC tiene tres cortes de 
        notas en una asignatura con valor de 0.0 a 5.0, el primer y segundo corte 
        vale un 20% y el tercer corte vale 60%. Desarrollar una solución algorítmica 
        que permita saber que nota se debe sacar como mínimo en el 60% si conozco 
        los primeros 20%. Tener en cuenta que para superar una asignatura debe 
        ser igual o mayor a 3.0. */
        
        /*double primer, segundo, valorTotal;
       
        do {   
        System.out.println("La nota debe estar entre el 0.0 y 5.0");
        System.out.println("Ingres el valor del primero corte: ");
        primer = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo corte: ");
        segundo = sc.nextDouble();
        } while (primer > 5 || primer < 0 || segundo > 5 || segundo < 0);
        
        valorTotal = (primer * 0.20);
        valorTotal = valorTotal + (segundo*0.20);
       
        valorTotal = (3.0 - valorTotal) / 0.6;
        
        System.out.println("El estudiante debe sacar como minimo en el tercer corte para alcanzar el 3.0 es: "+valorTotal);*/
        
        
        //-------------------------------------------------------------------------------
        
        /*4. Calcular el área de un triángulo, sabiendo la base y la altura.*/
        
        /*float base, altura, area;
        
        System.out.println("Ingrese el valor de la base en centimetros: ");
        base = sc.nextFloat();
        System.out.println("Ingrese el valor de la altura en centimetros: ");
        altura = sc.nextFloat();
        
        area = base * altura / 2;
        
        System.out.println("El area del triangulo es: "+area+" centimetros cuadrados");*/
        
        
        //-------------------------------------------------------------------------------
       
        /*5. Calcular el perímetro de un triángulo sabiendo los tres lados*/
        
        /*double a, b, c, perimetro;
        
        System.out.println("Ingrese los datos en centimtros");
        System.out.println("Ingrese el valor del lado a:");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor del lado b:");
        b = sc.nextDouble();
        System.out.println("Ingrese el valor del lado c:");
        c = sc.nextDouble();
        
        perimetro = a+b+c;
        
        System.out.println("El perimetros del triangulo es: "+perimetro+ " centrimetros");*/
        
        //-------------------------------------------------------------------------------
        
        /*6. Convertir en grados Farengie el valor ingresado por teclado en grados Celcio*/
        
        /*System.out.println("Ingrese los grados Farengie");
        float gradosF = sc.nextFloat();
        float gradosC = (gradosF - 32)*5/9;
        
        
        System.out.println(gradosC+" grados Celcios");*/
        
        //-------------------------------------------------------------------------------
        
        /*7. Convertir en grados Celcios el valor ingresado por teclado en grados 
        Farengei*/
        
        /*System.out.println("Ingrese los grados Celcios");
        float gradosC = sc.nextFloat();
        float gradosF = (gradosC * 9/5) + 32;
        
        System.out.println(gradosF+" grados fahrenheit");*/

        //-------------------------------------------------------------------------------
        
        /*8. Un programa que lea el valor correspondiente a una distancia en millas 
        marinas y las escribas expresadas en metros. Sabiendo que 1 milla marina 
        equivale a 1852 metros.*/

        /*System.out.println("Ingrese la distancia en milas marinas");
        int milla = sc.nextInt();
        int metros = milla * 1852;
        
        System.out.println(metros+" Metros");*/
        
        //-------------------------------------------------------------------------------
        
        /*9. Un programa que escribe el porcentaje descontado en una compra, 
        introduciendo por teclado el precio de la tarifa y el precio pagado.*/
        
        /*System.out.println("Introdusca el precio del articulo");
        int precioAr = sc.nextInt();
        System.out.println("Introdusca la tarifa a descontar");
        int tarifa = sc.nextInt();
        
        float descuento = (float) tarifa/precioAr * 100;
        precioAr = precioAr - tarifa;
        System.out.println("El precio final del articulo es: "+precioAr);
        System.out.println("El descuento realizado fue de: "+descuento+"%");*/
        
        //-------------------------------------------------------------------------------
        
        /*10.Un programa que reciba por teclado el precio de un artículo y calcule cual es 
        el valor pagado por el iva de ese artículo.*/
        
        /*System.out.println("Ingrese el precio del articulo");
        int precio =sc.nextInt();
        
        int precioIva = (int) (precio + (precio * 0.19));
        System.out.println("Aplicando el Iva del 19% el valor final del articulo es: "+precioIva);*/
        
        //-------------------------------------------------------------------------------
        
        /*11.Un programa que pida por teclado dos números enteros y muestre su suma, 
        resta, multiplicación, división y el resto (módulo) de la división.*/
        
        /*System.out.println("Ingrese el valor #1");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el valor #2");
        int n2 = sc.nextInt();
        int resultado;
        
        System.out.println("El resultado del suma de los numero es:");
        resultado = n1+n2;
        System.out.println(resultado);
        
        System.out.println("El resultado de la resta es:");
        resultado = n1-n2;
        System.out.println(resultado);
        
        System.out.println("El resultado de la multiplicacion es:");
        resultado = n1 * n2;
        System.out.println(resultado);
        
        System.out.println("El residuo de la diviciones:");
        resultado = (n1%n2);
        System.out.println(resultado);*/
        
        //-------------------------------------------------------------------------------
        
        /*12.Un programa que obtiene la última cifra de un número introducido*/
        
        /*System.out.println("Introdusca un numero");
        int numero = sc.nextInt();
        
        int ultimoN = numero%10;
        
        System.out.println("El ultino numero es: "+ultimoN);*/
        
        //-------------------------------------------------------------------------------
        
        /*13.Un programa que tras introducir una medida expresada en centímetros la 
        convierta en pulgadas (1 pulgada = 2,54 centímetros)*/
        
        /*System.out.println("Ingrese los centrimetros");
        float centimetro = sc.nextFloat();
        
        float pulgada = (float) (centimetro/2.54);
        
        System.out.println(pulgada+" Pulgadas");*/
        
        //-------------------------------------------------------------------------------
        
        /*14.Un programa que exprese en horas, minutos y segundos un tiempo 
        expresado en segundos.*/
        
        /*System.out.println("Ingrese un tiempo en segundo");
        int segundo = sc.nextInt();
        int minutos = 0, horas = 0, validacion = 0;
        
        
        while (segundo > 60) {
            segundo = segundo - 60;
            minutos++;
        }
        
        while (minutos > 60) {
            minutos = minutos - 60;
            horas++;
        }
        System.out.println(horas+ " Horas");
        System.out.println(minutos+" Minutos");
        System.out.println(segundo+" Segundos");
        System.out.println(horas+" : "+minutos+" : "+segundo);*/
        
        //-------------------------------------------------------------------------------
        
        /*15.Se desea saber cuál es el valor total para pagar de un artículo, sabiendo su 
        valor por unidad y la cantidad de artículos a llevar. Desarrollar un programa que, 
        dado el valor de unidad de un artículo y la cantidad de artículos, calcule 
        el valor total y lo imprima.*/
        
        /*System.out.println("Ingrese la cantidad de articulos a llevar");
        int articulos = sc.nextInt();
        System.out.println("Ingrese el valor del articulo");
        int valor = sc.nextInt();
        
        int valortotal = articulos * valor;
        
        System.out.println("El valor total a pagar es de: "+valortotal);*/
        
        //-------------------------------------------------------------------------------
        
        /*16.Desarrollar un algoritmo que dado el radio de un círculo calcule e imprima el 
        área.*/
        
        /*System.out.println("Ingrese el radio del circulo");
        float radio = sc.nextFloat();
        
        float area = (float) (3.1416*(radio*radio));
        
        System.out.println("El area del circulo es de: "+area);*/
        
        //-------------------------------------------------------------------------------
        
        /*17.Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un 
        rectángulo dada la longitud de dos de sus lados.*/
        
        /*P = 2· a + 2· b
          A= a · b*/
        
        /*System.out.println("Ingrese la longitud del lado 1 en centimetros:");
        float lado1 = sc.nextFloat();
        
        System.out.println("Ingrese la longitud del lado 2 en centimetros:");
        float lado2 = sc.nextFloat();
        
        float perimetro = 2 * lado1 + 2 * lado2;
        float area = lado1 * lado2;
        
        System.out.println("El perimetro es de: "+perimetro+" centimetros");
        System.out.println("El area es de: "+area+" centimetros cuadrados");*/
        
        //-------------------------------------------------------------------------------
        
        /*18.Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un 
        cuadrado dado uno de sus lados*/
        
        /*P = 4 · a
        A= a2*/

        /*System.out.println("Ingrese el valor del lado en centimetros");
        float lado = sc.nextFloat();
        
        float perimetro = 4 * lado;
        float area = lado * lado;
        
        System.out.println("El perimetro es de: "+perimetro+" centimetros");
        System.out.println("El area es de: "+area+" centimetros cuadrados");*/
        
        //-------------------------------------------------------------------------------
        
        /*19.Desarrollar un algoritmo que, dado el valor de x, y, z calcule e imprima el 
        valor de A según la siguiente formula
        A=2x2 y3 z*/
        
        System.out.println("Ingrese el valor de x:");
        int x = sc.nextInt();
        System.out.println("Ingrese el valor de y:");
        int y = sc.nextInt();
        System.out.println("Ingrese el valor de z:");
        int z = sc.nextInt();
        System.out.println();
        
        
        int a = 2*(x*x)*(y*y*y)*z;
        
        System.out.println("El valor de a es de: "+a);
        
    }
}
