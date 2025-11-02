import java.util.Scanner;

public class Ejercicios {

    private Scanner lectorTeclado;

    public void ejercicio1(){
        /*
        Mayor de edad
        Crea un programa que pida la edad del usuario y determine si es mayor
        de edad (18 años o más). Muestra un mensaje indicando si puede votar o no.
        Ejemplo de salida por consola:
        Introduce tu edad: 20
        Eres mayor de edad. Puedes votar.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");

        }System.out.println("No Eres mayor de edad. No puedes votar");

        lectorTeclado.close();
    }

    public void ejercicio2(){
        /*
        Desarrolla un programa que pida un número al usuario y determine si es positivo,
        negativo o cero. Muestra el resultado por consola.
        Ejemplo de salida por consola:
        Introduce un número: -5
        El número es negativo.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce un número: ");
        int numero = lectorTeclado.nextInt();

        if(numero>=0){
            System.out.println("El número es positivo.");

        } else{
            System.out.println("El número es negativo.");
        }

        lectorTeclado.close();
    }

    public void ejercicio3(){
        /*
        Escribe un programa que pida la nota de un examen (entre 0 y 10) y
        determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
        Ejemplo de salida por consola:
        Introduce tu nota: 6.5
        ¡Enhorabuena! Has aprobado.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu nota: (entre 0 y 10): ");
        float numero = lectorTeclado.nextFloat();

        if(numero>=5 && numero<10){
            System.out.println("¡Enhorabuena! Has aprobado." + numero);

        } else {
            System.out.println("¡Lo siento! Has suspendido.");
        }

        lectorTeclado.close();
    }

    public void ejercicio4(){
        /*
        Descuento por compra
        Crea un programa que pida el importe de una compra.
        Si el importe es mayor o igual a 100€, aplica un descuento del 10%.
        Muestra el importe original y el importe final a pagar.
        Ejemplo de salida por consola:
        Introduce el importe de la compra: 120
        Importe original: 120.0€
        Descuento aplicado: 12.0€
        Importe final: 108.0€
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra: ");
        float importe = lectorTeclado.nextFloat();

        float descuento;
        float importeFinal;

        if(importe>=100){

            System.out.println("Importe original:" + importe);

            descuento=importe*10/100;

            System.out.println("Descuento aplicado:" + descuento);

            importeFinal = importe-descuento;

            System.out.println("Importe final:" + importeFinal);


        } else {
            System.out.println("Importe original:" + importe);
        }

        lectorTeclado.close();
    }

    public void ejercicio5(){
        /*
        Número par o impar con mensaje
        Desarrolla un programa que pida un número entero y determine si es par
        o impar usando el operador módulo. Muestra un mensaje personalizado para cada caso.
        Ejemplo de salida por consola:
        Introduce un número: 8
        El número 8 es par.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = lectorTeclado.nextInt();


        if(numero % 2 == 0){

            System.out.printf("El número " + numero+ " es par. ");


        } else {
            System.out.println("El número es impar.");
        }

        lectorTeclado.close();
    }

    public void ejercicio6(){
        /*
        Acceso a contenido por edad
        Escribe un programa que pida la edad del usuario y determine si puede acceder
        a contenido para mayores de 16 años. Si tiene 16 o más años, muestra "Acceso permitido",
        si no, muestra "Acceso denegado".
        Ejemplo de salida por consola:
        Introduce tu edad: 15
        Acceso denegado. Debes tener al menos 16 años.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();


        if(edad >=16){

            System.out.println("Acceso permitido. ");


        } else if (edad < 0) {
            System.out.println("Edad no valida.");
        }
        else{
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }

        lectorTeclado.close();
    }

    public void ejercicio7(){
        /*
        Calificación con letra
        Crea un programa que pida una nota numérica (0-10) y determine la calificación:
        Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
        Ejemplo de salida por consola:
        Introduce tu nota: 8
        Tu calificación es: Notable
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu nota: ");
        float nota = lectorTeclado.nextFloat();


        if(nota >= 0 && nota <= 4.99){

            System.out.println("Suspenso. ");


        } else if (nota >= 5 && nota <= 6.99) {
            System.out.println("Aprobado.");
        }
        else if (nota >= 7 && nota <= 8.99) {
            System.out.println("Notable.");
        }
        else{
            System.out.println("Sobresaliente");
        }

        lectorTeclado.close();
    }

    public void ejercicio8(){
        /*
        Comparar dos números
        Desarrolla un programa que pida dos números al usuario y determine cuál es mayor,
        o si son iguales. Muestra el resultado por consola.
        Ejemplo de salida por consola:
        Introduce el primer número: 15
        Introduce el segundo número: 10
        El número 15 es mayor que 10.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = lectorTeclado.nextInt();


        if(numero1 >= numero2){

            System.out.println("El número " + numero1+ " es mayor que " + numero2);


        } else{
            System.out.println("El número " + numero1+ " es menor que " + numero2);
        }

        lectorTeclado.close();
    }

    public void ejercicio9(){
        /*
        Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario.
        Calcula el IMC (peso / altura²) y determina si está en peso normal
        (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5)
        o por encima del peso normal (IMC mayor a 24.9).
        Ejemplo de salida por consola:
        Introduce tu peso en kg: 70
        Introduce tu altura en metros: 1.75
        Tu IMC es: 22.86
        Estás en peso normal.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);



        System.out.println("Introduce tu peso en kg: ");
        int peso = lectorTeclado.nextInt();

        System.out.println("Introduce tu altura en metros: ");
        float altura = lectorTeclado.nextFloat();

        float imc = peso /(altura*altura);

        if(imc >=18.5 && imc <= 24.9){

            System.out.println("Tu IMC es: " + imc );
            System.out.println("Estás en peso normal. " );


        } else if(imc > 24.9){

            System.out.println("Tu IMC es: " + imc );
            System.out.println("Estás por encima de tu peso. " );
        } else if(imc > 18.5) {

            System.out.println("Tu IMC es: " + imc);
            System.out.println("Estás por debajo de tu peso. ");
        }
        lectorTeclado.close();
    }

    public void ejercicio10(){
        /*
        Entrada a parque de atracciones
        Crea un programa que pida la altura del usuario (en cm)
        y determine si puede subir a una atracción.
        La altura mínima es 120 cm y la máxima es 200 cm.
        Si está dentro del rango, muestra "Puedes subir", si no,
        indica el motivo (demasiado bajo o demasiado alto).
        Ejemplo de salida por consola:
        Introduce tu altura en cm: 115
        No puedes subir a la atracción. Altura mínima: 120 cm.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);



        System.out.println("Introduce tu altura en cm: ");
        int altura = lectorTeclado.nextInt();

        if(altura >= 120 && altura <= 200){

            System.out.println("Puedes subir ");

        }
         else {

            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        }
        lectorTeclado.close();
    }

    public void ejercicio11() {
        /*
        Sistema de descuentos por niveles
        Desarrolla un programa que pida el importe de una compra y si el cliente es socio
        (true/false).
        Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€,
        descuento del 20%. Si es socio Y la compra es menor de 200€,
        descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€,
        descuento del 5%. En cualquier otro caso, no hay descuento.
        Muestra el importe original, el descuento aplicado y el importe final.
        Ejemplo de salida por consola:
        Introduce el importe de la compra: 250
        ¿Eres socio? (true/false): true
        Importe original: 250.0€
        Eres socio y tu compra es >= 200€
        Descuento aplicado (20%): 50.0€
        Importe final: 200.0€
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra: ");
        int importe = lectorTeclado.nextInt();

        System.out.println("¿Eres socio? (true/false): ");
        boolean socio = lectorTeclado.nextBoolean();


        int importeFinal;
        float descuento;

        if (importe >= 200 && socio) {
            descuento = (float) importe * 20 / 100;
            importeFinal = importe - (int) descuento;
            System.out.println("Importe original: " + (float) importe + "€");
            System.out.println(" Eres socio y tu compra es >= " + importeFinal + "€");
            System.out.println(" Descuento aplicado (20%):" + descuento + "€");
            System.out.println(" Importe final:" + (importe - descuento) + "€");

        }
        if (importe < 200 && socio) {
            descuento = (float) importe * 10 / 100;
            importeFinal = importe - (int) descuento;
            System.out.println("Importe original: " + (float) importe + "€");
            System.out.println(" Eres socio y tu compra es >= " + importeFinal + "€");
            System.out.println(" Descuento aplicado (10%):" + descuento + "€");
            System.out.println(" Importe final:" + (importe - descuento) + "€");
        }
        if (importe >= 300) {
            descuento = (float) importe * 5 / 100;
            importeFinal = importe - (int) descuento;
            System.out.println("Importe original: " + (float) importe + "€");
            System.out.println(" Eres socio y tu compra es >= " + importeFinal + "€");
            System.out.println(" Descuento aplicado (5%):" + descuento + "€");
            System.out.println(" Importe final:" + (importe - descuento) + "€");

        }
        else {
            System.out.println("Importe original: " + (float) importe + "€");
            System.out.println(" Eres socio y tu compra es >= " + importe + "€");
            System.out.println(" No tiene Descuento:" + importe + "€");
            System.out.println(" Importe final:" + importe + "€");
        }
            lectorTeclado.close();
    }

    public void ejercicio12(){
        /*
        Validador de contraseña
        Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud,
        contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos
        y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.
        Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto),
        contienNumero(texto).

        Ejemplo de salida por consola:
        Introduce una contraseña: abc123
        Longitud de la contraseña: 6
        ¿Tiene al menos 8 caracteres?: false
        ¿Contiene al menos un número?: true
        ¿Es una contraseña prohibida?: false
        ¿Es válida? (cumple todos los requisitos): false
        Contraseña NO válida. Debe tener al menos 8 caracteres.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);



        System.out.println(" Introduce una contraseña: ");




        lectorTeclado.close();
    }

    public void ejercicio13(){
        /*
        Calculadora de precio de entradas
        Escribe un programa para calcular el precio de entrada a un museo.
        Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
        Las reglas son: Menores de 12 años: entrada gratis.
        Entre 12 y 17 años: 5€ (pero gratis los martes).
        Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€.
        Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.


        Ejemplo de salida por consola:
        Introduce tu edad: 15
        Introduce el día de la semana (1-7): 2
        Edad: 15 años
        Día de la semana: 2 (Martes)
        ¿Eres menor de 12?: false
        ¿Tienes entre 12 y 17?: true
        ¿Es martes?: true
        Precio de entrada: 0.0€ (Entrada gratuita para menores en martes)
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);



        System.out.println(" Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.println(" Introduce el día de la semana (1-7): ");
        int dia = lectorTeclado.nextInt();


        boolean menor12 = edad <= 12;
        boolean entre12y17 = edad >=12 && edad <=17;
        boolean entre18y64 = edad >=18 && edad <=64;
        boolean mayor65 = edad >= 65;



        if(edad<12){

            System.out.println("¿Eres menor de 12?: "+ (false));

        }
         else if( edad<=17){

            System.out.println("¿Tienes entre 12 y 17?: "+ (true));

        }
        else {

            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        }
        lectorTeclado.close();
    }


    public void ejercicio14(){
        /*
        Elegibilidad para préstamo
        Desarrolla un programa que determine si una persona es elegible para
        un préstamo bancario. Pide: edad, ingresos mensuales (€),
        y si tiene deudas pendientes (true/false).
        Los requisitos son: Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€,
        y NO tener deudas pendientes. El programa debe evaluar cada condición
        y mostrar si es elegible o no, explicando qué requisitos no cumple.

        Ejemplo de salida por consola:
        Introduce tu edad: 25
        Introduce tus ingresos mensuales: 1200
        ¿Tienes deudas pendientes? (true/false): false
        ¿Edad entre 21 y 65?: true
        ¿Ingresos >= 1000€?: true
        ¿Sin deudas pendientes?: true
        ¿Es elegible para el préstamo?: true
        ¡Felicidades! Eres elegible para solicitar el préstamo.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);



        System.out.println(" Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.println(" Introduce tus ingresos mensuales (€): ");
        int ingreso = lectorTeclado.nextInt();

        System.out.println(" ¿Tienes deudas pendientes? (true/false): ");
        boolean deuda = lectorTeclado.nextBoolean();

        boolean entre21y65 = edad>=21 && edad <=65;
        boolean ingresos= ingreso>=1000;
        boolean pendientes = deuda=true;
        boolean resultado = entre21y65 && ingresos;

        if(entre21y65){

            System.out.println("¿Edad entre 21 y 65?: " + entre21y65);
            System.out.println("¿Ingresos >= 1000€?: " +ingresos);
            System.out.println("¿Sin deudas pendientes?: " + pendientes);
            System.out.println("¿Es elegible para el préstamo?: "+ resultado);
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");

        }
        else{
            System.out.println("¡Lo siento! No eres elegible para solicitar el préstamo.");
        }


        lectorTeclado.close();
    }

    public void ejercicio15() {
        /*
        Sistema de envío con múltiples condiciones
        Crea un programa que calcule el coste de envío de un paquete.
        Pide: peso del paquete (kg), distancia de envío (km),
        y si es envío urgente (true/false).
        Las reglas son: Precio base: 5€.
        Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.
        Si la distancia es mayor de 100km,
        añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5.
        Muestra todos los cálculos paso a paso.

        Ejemplo de salida por consola:
        Introduce el peso del paquete (kg): 7
        Introduce la distancia de envío (km): 150
        ¿Es envío urgente? (true/false): true
        Precio base: 5.0€
        Peso: 7kg (excede 5kg en 2kg)
        Coste adicional por peso: 4.0€
        Distancia: 150km (mayor de 100km)
        Coste adicional por distancia: 10.0€
        Subtotal: 19.0€
        ¿Es envío urgente?: true
        Recargo por urgencia (x1.5): 9.5€
        Coste total de envío: 28.5€
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println(" Introduce el peso del paquete (kg): ");
        int peso = lectorTeclado.nextInt();

        System.out.println(" Introduce la distancia de envío (km): ");
        int km = lectorTeclado.nextInt();

        System.out.println(" ¿Es envío urgente? ");
        boolean envio = lectorTeclado.nextBoolean();

        int precioBase = 5;
        System.out.println(" Precio base: " + precioBase + "€");


        float costeTotal;
        float pesoAdicional = peso - 5;
        float costeAdicional = 2 * pesoAdicional;
        float costeAdicionalKm = 10;
        float subtotal = costeAdicional + costeAdicionalKm + precioBase;
        double recargo = (subtotal * 1.5)-subtotal;
        double precioFinal = costeAdicional + costeAdicionalKm + precioBase + recargo;

        if (peso > 5) {
            System.out.println("Peso: " + peso + "Kg. (excede 5kg en " + pesoAdicional + " kg) ");
            System.out.println("Coste adicional por peso: " + costeAdicional + "€");

        }
        if (km > 100) {
            System.out.println("Distancia: " + km + " (mayor de 100km) ");
            System.out.println("Coste adicional por distancia: " + costeAdicionalKm + "€ ");
            System.out.println("Subtotal: " + subtotal + "€ ");
            System.out.println("¿Es envío urgente?: " + envio);
            System.out.println("Recargo por urgencia (x1.5): " + recargo + "€");
            System.out.println("Coste total de envío: " + precioFinal + "€");
        }


        lectorTeclado.close();
    }


    //Ejercicios de Estructuras IF WEb Profe Java


    public void ejercicio16() {
        /*
        Verificador de Edad

        Escribe un programa que solicite al usuario su edad y
        determine si es mayor de edad (18 años o más) o menor de edad.
        El programa debe mostrar un mensaje apropiado según el resultado.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println(" Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();


        if (edad >= 18) {

            System.out.println("Eres mayor de edad eres apto para el trabajo: " + edad );

        }
        else if (edad >=0 && edad < 16) {

            System.out.println("No eres mayor de edad no eres apto para el trabajo: " + edad );
        }

        System.out.println("No es una edad admintida: " + edad );


        lectorTeclado.close();
    }

    public void ejercicio17() {
        /*
        Calculadora de Impuestos

        Crea un programa que pida al usuario su salario anual y calcule el impuesto a pagar
        según las siguientes reglas:

        - Menos de 10.000€: no paga impuestos
        - Entre 10.000€ y 20.000€: paga el 5% de impuestos
        - Entre 20.000€ y 35.000€: paga el 15% de impuestos
        - Más de 35.000€: paga el 20% de impuestos

        El programa debe mostrar el salario original y el monto de impuestos a pagar.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println(" Introduce salario anual: ");
        int salario = lectorTeclado.nextInt();

        int impuestos = salario;

        if (salario <= 10000) {

            System.out.println("No paga impuestos ");

        } else if (salario <= 20000) {

            impuestos = salario * 5 / 100;
            System.out.println("Pagas el 5% de impuestos: " + impuestos + "€.");
        } else if (salario <= 35000) {

            impuestos = salario * 15 / 100;
            System.out.println("Pagas el 15% de impuestos: " + impuestos + "€.");
        }
        else {
            impuestos = salario * 20 / 100;
            System.out.println("Paga el 20% de impuestos: " + impuestos + "€.");
        }


        lectorTeclado.close();

    }

    public void ejercicio18() {
        /*
        Comparador de Números

        Desarrolla un programa que solicite tres números enteros y determine cuál
        es el mayor de los tres. Muestra el resultado en pantalla.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println(" Introduce el primer número entero: ");
        int numero1 = lectorTeclado.nextInt();

        System.out.println(" Introduce el segundo número entero: ");
        int numero2 = lectorTeclado.nextInt();

        System.out.println(" Introduce el tercer número entero: ");
        int numero3 = lectorTeclado.nextInt();

        if (numero1 >= numero2 & numero1 >= numero3) {

            System.out.println("El número mayor es el: " + numero1);

        }

        if (numero2 >= numero1 & numero2 >= numero3) {

            System.out.println("El número mayor es el: " + numero2);

        }

        if (numero3 >= numero1 & numero3 >= numero2) {

            System.out.println("El número mayor es el: " + numero3);

        }

        lectorTeclado.close();

    }

    public void ejercicio19() {
        /*
        Calculadora de Nota Final

        Crea un programa que solicite al usuario tres notas parciales (de 0 a 10)
        y calcule la nota final como el promedio de las tres. Además, el programa debe mostrar:

        - Si la nota final es menor a 5: "Suspenso"
        - Si la nota final está entre 5 y 6.9: "Aprobado"
        - Si la nota final está entre 7 y 8.9: "Notable"
        - Si la nota final es 9 o superior: "Sobresaliente"
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce primera nota parcial (de 0 a 10): ");
        int nota1 = lectorTeclado.nextInt();

        System.out.println("Introduce segunda nota parcial (de 0 a 10): ");
        int nota2 = lectorTeclado.nextInt();

        System.out.println("Introduce tercera nota parcial (de 0 a 10): ");
        int nota3 = lectorTeclado.nextInt();

        int nota = (nota1 + nota2 + nota3) / 3;

        if (nota < 5) {

            System.out.println("Suspenso: " +nota);

        }

        else if (nota >= 5 && nota <= 6.9) {

            System.out.println("Aprobado " +nota);

        }

        else if (nota >= 7 && nota <= 8.9) {

            System.out.println("Notable " +nota);

        }
        else if (nota >= 9 && nota <= 10)
            System.out.println("Sobresaliente " +nota);

        lectorTeclado.close();

    }

    public void ejercicio20() {
        /*
        Verificador de Año Bisiesto

        Escribe un programa que solicite al usuario un año y determine si es bisiesto o no.
        Un año es bisiesto si es divisible por 4,
        excepto aquellos divisibles por 100 pero no por 400.

        Por ejemplo: 2000 es bisiesto, 1900 no lo es, 2004 es bisiesto.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Escribe un año para saber si es bisiesto o no: ");
        int ano = lectorTeclado.nextInt();

        // Verificamos si es bisiesto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 ==0)) {

            System.out.println( ano + "Si es bisiesto ");

        }
        else {

            System.out.println("No es bisiesto ");

        }

        lectorTeclado.close();

    }


    //Ejercicios de Estructuras IF

    public void ejercicio21() {
        /*
        Convertidor de Días de la Semana

        Desarrolla un programa que solicite al usuario un número del 1 al 7
        y muestre el día de la semana correspondiente (1: Lunes, 2: Martes, etc.).
        Si el número está fuera del rango, debe mostrar un mensaje de error.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce un número del 1 al 7: ");
        int numero = lectorTeclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Día de la semana es: lunes");
                break;
            case 2:
                System.out.println("Día de la semana es: Martes");
                break;
            case 3:
                System.out.println("Día de la semana es: Miércoles");
                break;
            case 4:
                System.out.println("Día de la semana es: Jueves");
                break;
            case 5:
                System.out.println("Día de la semana es: Viernes");
                break;
            case 6:
                System.out.println("Día de la semana es: Sábado");
                break;

            default:
                System.out.println("Día de la semana es: Domingo");

        }
        lectorTeclado.close();
    }

    public void ejercicio22() {
        /*
        Calculadora Básica

        Crea una calculadora simple que solicite dos números y una operación a realizar
        (representada por un número):

        - 1: Suma
        - 2: Resta
        - 3: Multiplicación
        - 4: División

        El programa debe realizar la operación seleccionada y mostrar el resultado.
        Si se selecciona la división y el segundo número es cero, debe mostrar un mensaje de error.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce un número: ");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("Introduce otro número: ");
        int numero2 = lectorTeclado.nextInt();

        System.out.println("1.Suma ");
        System.out.println("2.Resta ");
        System.out.println("3.División ");
        System.out.println("4.Multiplicación ");
        int resultado = lectorTeclado.nextInt();


        switch (resultado) {
            case 1:
                resultado= numero1+numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado= numero1-numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado= numero1/numero2;
                if (resultado == 0) {
                    System.out.println("La operación no es correcta");
                }
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                resultado= numero1*numero2;
                System.out.println("El resultado es: " + resultado);

        }
        lectorTeclado.close();
    }

    public void ejercicio23() {
        /*
        Traductor de Meses

        Escribe un programa que pida al usuario un número del 1 al 12 y muestre el nombre
        del mes correspondiente en español e inglés. Por ejemplo, si el usuario ingresa 1,
        el programa mostrará "Enero - Febrero".
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce un número del número del 1 al 12: ");
        int numero = lectorTeclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Enero, Monday");
                break;
            case 2:
                System.out.println("Febrero, Monday");
                break;
            case 3:
                System.out.println("Marzo, Monday");
                break;
            case 4:
                System.out.println("Abril, Monday");
                break;
            case 5:
                System.out.println("Mayo, Monday");
                break;
            case 6:
                System.out.println("Junio, Monday");
                break;
            case 7:
                System.out.println("Julio, Monday");
                break;
            case 8:
                System.out.println("Agosto, Monday");
                break;
            case 9:
                System.out.println("Septiembre, Monday");
                break;
            case 10:
                System.out.println("Octubre, Monday");
                break;
            case 11:
                System.out.println("Noviembre, Noenber");
            default:
                System.out.println("Diciembre, December");

        }
        lectorTeclado.close();
    }

    public void ejercicio24() {
        /*
        Evaluador de Vocales

        Desarrolla un programa que solicite al usuario una letra y determine si es una vocal o una consonante.
        Además, si es una vocal, debe indicar si es mayúscula o minúscula. Utiliza la estructura switch para evaluar los casos.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.print("Introduce una letra: ");
        char letra = lectorTeclado.next().charAt(0); // Leemos el primer carácter

        // Evaluamos la letra usando switch
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra '" + letra + "' es una vocal minúscula.");
                break;

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("La letra '" + letra + "' es una vocal mayúscula.");
                break;

            default:
                // Verificamos que sea una letra del alfabeto
                if (Character.isLetter(letra)) {
                    System.out.println("La letra '" + letra + "' es una consonante.");
                } else {
                    System.out.println("'" + letra + "' no es una letra.");
                }
                break;
        }

        lectorTeclado.close();
    }

    public void ejercicio25() {
        /*
        Conversor de Unidades

        Crea un programa que permita convertir una cantidad entre diferentes unidades de medida. El usuario debe ingresar:

        - La cantidad a convertir
        - Un número que represente el tipo de conversión:
        1. 1: De centímetros a pulgadas (1 pulgada = 2.54 cm)
        2. 2: De kilogramos a libras (1 kg = 2.2046 libras)
        3. 3: De euros a dólares (usar una tasa de cambio fija, por ejemplo 1€ = 1.10$)
        4. 4: De kilómetros a millas (1 km = 0.621371 millas)

        El programa debe mostrar el resultado de la conversión con un mensaje apropiado.

        Desarrolla un programa que s
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad a convertir: ");
        double numero = lectorTeclado.nextDouble(); // Leemos el primer carácter

        System.out.println("1: De centímetros a pulgadas (1 pulgada = 2.54 cm). ");
        System.out.println("2: De kilogramos a libras (1 kg = 2.2046 libras). ");
        System.out.println("3: De euros a dólares (usar una tasa de cambio fija, por ejemplo 1€ = 1.10$).");
        System.out.println("4: De kilómetros a millas (1 km = 0.621371 millas)");
        int resultado = lectorTeclado.nextInt();



        lectorTeclado.close();
    }

    public void ejercicio26() {
        /*
        Conversor de Unidades

        Crea un programa que permita convertir una cantidad entre diferentes unidades de medida. El usuario debe ingresar:

        - La cantidad a convertir
        - Un número que represente el tipo de conversión:
        1. 1: De centímetros a pulgadas (1 pulgada = 2.54 cm)
        2. 2: De kilogramos a libras (1 kg = 2.2046 libras)
        3. 3: De euros a dólares (usar una tasa de cambio fija, por ejemplo 1€ = 1.10$)
        4. 4: De kilómetros a millas (1 km = 0.621371 millas)

        El programa debe mostrar el resultado de la conversión con un mensaje apropiado.
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad a convertir: ");
        double cantidad = lectorTeclado.nextDouble(); // Leemos el primer carácter

        System.out.println("1: De centímetros a pulgadas (1 pulgada = 2.54 cm). ");
        System.out.println("2: De kilogramos a libras (1 kg = 2.2046 libras). ");
        System.out.println("3: De euros a dólares (usar una tasa de cambio fija, por ejemplo 1€ = 1.10$).");
        System.out.println("4: De kilómetros a millas (1 km = 0.621371 millas)");
        System.out.print("Selecciona una opción del 1 al 4:)");
        int opcion = lectorTeclado.nextInt();

        double resultado= 0;

        switch (opcion){
            case 1:
                resultado = cantidad / 2.54;
                System.out.println(cantidad + " cm equivalen a " + resultado + " pulgadas.");
                break;

            case 2:
                resultado = cantidad * 2.2046;
                System.out.println(cantidad + " kg equivalen a " + resultado + " libras.");
                break;

            case 3:
                resultado = cantidad * 1.10;
                System.out.println(cantidad + " euros equivalen a " + resultado + " dólares.");
                break;

            case 4:
                resultado = cantidad * 0.621371;
                System.out.println(cantidad + " km equivalen a " + resultado + " millas.");
                break;

            default:
                System.out.println("Opción inválida. Intenta nuevamente.");
                break;

        }

        lectorTeclado.close();
    }



    //Ejercicios Switch y For Notion

    public void ejercicio27() {
        /*
        Día de la semana
        Crea un programa que pida un número del 1 al 7 y use un switch para mostrar
        el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
        Ejemplo de salida por consola:
        Introduce un número (1-7): 3
        El día 3 es: Miércoles
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce número del 1 al 7: ");
        int numero = lectorTeclado.nextInt(); // Leemos el primer carácter

        String resultado;

        switch (numero){
            case 1:
                resultado = "Lunes";
                System.out.println(" El día 1 es: " + resultado);
                break;

            case 2:
                resultado = "Martes";
                System.out.println(" El día 2 es: " + resultado);
                break;

            case 3:
                resultado = "Miércoles";
                System.out.println(" El día 3 es: " + resultado);
                break;

            case 4:
                resultado = "Jueves";
                System.out.println(" El día 4 es: " + resultado);
                break;

            case 5:
                resultado = "Viernes";
                System.out.println(" El día 5 es: " + resultado);
                break;

            case 6:
                resultado = "Sábado";
                System.out.println(" El día 6 es: " + resultado);
                break;

            default:
                System.out.println(" El día 7 es domingo");

        }

        lectorTeclado.close();
    }

    public void ejercicio28() {
        /*
        Calificación con switch
        Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar
        el mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        Ejemplo de salida por consola:
        Introduce tu calificación (A-F): B
        Calificación B: Muy bien
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu calificación (A-E): ");
        char letra = lectorTeclado.next().charAt(0); // Leemos el primer carácter


        switch (letra){
            case 'A':
                System.out.println(" Calificación A: Excelente");
                break;

            case 'B':
                letra='B';
                System.out.println(" Calificación B: Muy Bien");
                break;

            case 'C':
                System.out.println(" Calificación C: Bien");
                break;

            case 'D':
                System.out.println(" Calificación D: Suficiente");
                break;

            default:
                System.out.println(" Calificación E: Insuficiente");

        }

        lectorTeclado.close();
    }

    public void ejercicio29() {
        /*
        Calculadora básica con switch
        Escribe un programa que pida dos números y una operación (+, -, *, /).
        Usa un switch para realizar la operación correspondiente y mostrar el resultado.
        Ejemplo de salida por consola:
        Introduce el primer número: 10
        Introduce el segundo número: 5
        Introduce la operación (+, -, *, /): *
        Resultado: 10 * 5 = 50
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero1 = lectorTeclado.nextInt(); // Leemos el primer carácter

        System.out.print("Introduce un número: ");
        int numero2 = lectorTeclado.nextInt();

        System.out.println("Elige una operación: ");
        System.out.println("1. Suma: ");
        System.out.println("2. Resta: ");
        System.out.println("3. Multiplicación: ");
        System.out.println("4. División: ");
        int operacion = lectorTeclado.nextInt();

        int resultado;

        switch (operacion){
            case 1:
                resultado= numero1+numero2;
                System.out.println(" Resultado: " + numero1 + "+" + numero2 + " = " + resultado );
                break;

            case 2:
                resultado= numero1-numero2;
                System.out.println(" Resultado: " + numero1 + "-" + numero2 + " = " + resultado );
                break;

            case 3:
                resultado= numero1*numero2;
                System.out.println(" Resultado: " + numero1 + "*" + numero2 + " = " + resultado );
                break;

            default:
                resultado= numero1/numero2;
                System.out.println(" Resultado: " + numero1 + "/" + numero2 + " = " + resultado );

        }

        lectorTeclado.close();
    }

    public void ejercicio30() {
        /*
        Menú de opciones
        Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
        Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.
        Ejemplo de salida por consola:
        --- MENÚ ---
        1. Ver perfil
        2. Configuración
        3. Ayuda
        4. Salir
        Elige una opción: 2
        Has seleccionado: Configuración
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Menu opciones: ");

        System.out.println("1. Ver perfil ");
        System.out.println("2. Configuración ");
        System.out.println("3. Ayuda: ");
        System.out.println("4. Salir: ");
        int opciones = lectorTeclado.nextInt();

        String resultado;

        switch (opciones){
            case 1:
                resultado= "opciones";
                System.out.println("Has seleccionado: Ver perfil.");
                break;

            case 2:
                resultado= "opciones";
                System.out.println("Has seleccionado: Configuración.");
                break;

            case 3:
                resultado= "opciones";
                System.out.println("Has seleccionado: Ayuda.");
                break;

            default:
                System.out.println("Has seleccionado: Salir.");

        }

        lectorTeclado.close();
    }

    public void ejercicio31() {
        /*
        Estaciones del año
        Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del año:
        Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        Ejemplo de salida por consola:
        Introduce el número del mes (1-12): 7
        El mes 7 corresponde a: Verano
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce un número del (1 al 12): ");
        int mes = lectorTeclado.nextInt();

        String estacion;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;

            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;

            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;

            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;

            default:
                estacion = "Mes inválido. Debe estar entre 1 y 12.";
                break;
        }

        System.out.println("El mes " + mes + " corresponde a: " + estacion);

        lectorTeclado.close();
    }


}