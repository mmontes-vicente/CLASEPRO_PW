import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;

    public void ejercicio1(){
        /*
        Operadores aritméticos básicos
        Crea un programa que pida al usuario dos números enteros por consola y muestre
        el resultado de las cinco operaciones aritméticas básicas:
        suma, resta, multiplicación, división y módulo (resto).
        Ejemplo de salida por consola:
        Introduce el primer número: 15
        Introduce el segundo número: 4
        Suma: 19
        Resta: 11
        Multiplicación: 60
        División: 3
        Módulo (resto): 3
     */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);


        System.out.println("Introduce el primer número: ");
        int numero1 = lectorTeclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = lectorTeclado.nextInt();

        numero1 = 15;
        numero2 = 4;
        int suma = numero1+numero2;
        int resta = numero1+numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        int resto = numero1%numero2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
        System.out.println("Módulo (resto): "+resto);

        lectorTeclado.close();
    }

    public void ejercicio2(){

        /*
        Comparación de números
        Escribe un programa que pida dos números al usuario y muestre el resultado
        de todas las comparaciones relacionales entre ellos
        (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
        Ejemplo de salida por consola:
        Introduce el primer número: 10
        Introduce el segundo número: 10
        ¿10 es mayor que 10?: false
        ¿10 es menor que 10?: false
        ¿10 es igual a 10?: true
        ¿10 es diferente de 10?: false
        ¿10 es mayor o igual que 10?: true
        ¿10 es menor o igual que 10?: true
         */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce un primer número:");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("Introduce un segundo número:");
        int numero2 = lectorTeclado.nextInt();

        System.out.println("¿10 es mayor que 10?: " + (numero1>numero2));

        System.out.println("¿10 es menor que 10?: " + (numero1<numero2));

        System.out.println("¿10 es igual que 10?: " + (numero1==numero2));

        System.out.println("¿10 es diferente de 10?: " + (numero1!=numero2));

        System.out.println("¿10 es mayor o igual que 10?: " + (numero1>=numero2));

        System.out.println("¿10 es menor o igual que 10? " + (numero1<=numero2));


    }

    public void ejercicio3(){

        /*
        Operadores de asignación compuesta
        Crea un programa que declare una variable con valor inicial 100 y
        aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=).
        Muestra el valor de la variable después de cada operación.
        Ejemplo de salida por consola:
        Valor inicial: 100
        Después de sumar 50 (+=): 150
        Después de restar 30 (-=): 120
        Después de multiplicar por 2 (*=): 240
        Después de dividir entre 4 (/=): 60
         */

        int valorInicial = 100;
        int suma = valorInicial + 50;
        int resta = suma - 30;
        int multiplicar = resta *2;
        int dividir = multiplicar / 4;

        System.out.println("Valor inicial: " +valorInicial);
        System.out.println("Después de sumar 50 (+=): " +suma);
        System.out.println("Después de restar 30 (-=): " +resta);
        System.out.println("Después de multiplicar por 2 (*=): " +multiplicar);
        System.out.println("Después de dividir entre 4 (/=): " +dividir);



    }

    public void ejercicio4() {
    /*
    Número par o impar
    Desarrolla un programa que pida un número al usuario y determine si es par o impar
    usando el operador módulo. Muestra el resultado por consola.
    Ejemplo de salida por consola:
    Introduce un número: 7
    El número 7 es impar (resto al dividir entre 2: 1)
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduce un número: ");
        int numero = lectorTeclado.nextInt(); // Leemos el número introducido

        // Calculamos el resto de dividir entre 2
        int resto = numero % 2;

        // Creamos un arreglo (lista) con dos palabras: "par" y "impar"
        // Si el resto es 0, usamos "par"; si el resto es 1, usamos "impar"
        String[] tipo = {"par", "impar"};

        // Mostramos el resultado por pantalla
        System.out.println("El número " + numero + " es " + tipo[resto] +
                " (resto al dividir entre 2: " + resto + ")");

        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

    public void ejercicio5() {
    /*
    Operadores lógicos AND y OR
    Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
    Usa operadores lógicos para determinar si puede alquilar un coche
    (debe tener 21 años o más Y tener carnet).
    Ejemplo de salida por consola:
    Introduce tu edad: 23
    ¿Tienes carnet de conducir? (true/false): true
    ¿Eres mayor de 21 años?: true
    ¿Tienes carnet?: true
    ¿Puedes alquilar un coche? (AND): true
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Pedimos la edad al usuario
        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt(); // Leemos el número introducido

        // Pedimos si tiene carnet de conducir
        System.out.println("¿Tiene carnet de conducir? (true/false): ");
        boolean carnet = lectorTeclado.nextBoolean(); // Leemos el true/false introducido

        // Pedimos si es mayor de edad
        boolean mayorEdad = edad > 23; // true
        System.out.println("¿Eres mayor de 21 años?:" +mayorEdad);


        // Pedimos si tiene carnet
        boolean siCarnet = edad >= 21; // true
        System.out.println("¿Tienes carnet?: " + siCarnet);

        // Pedimos si puede alquilar coche
        boolean alquilar = edad >= 21; // true
        System.out.println("¿Puedes alquilar un coche? (AND): " + alquilar);


        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

    public void ejercicio6() {
    /*
    Calculadora de descuento
    Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
    Calcula el precio final después del descuento usando operadores aritméticos y muestra
    todos los pasos del cálculo.
    Ejemplo de salida por consola:
    Introduce el precio del producto: 100
    Introduce el porcentaje de descuento: 20
    Precio original: 100.0€
    Descuento (20%): 20.0€
    Precio final: 80.0€
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Pedimos precio del producto al usuario
        System.out.print("Introduce el precio del producto: ");
        int precioProducto = lectorTeclado.nextInt(); // Leemos el número introducido

        // Pedimos porcentaje de descuento
        System.out.print("Introduce el porcentaje de descuento: ");
        float descuento = lectorTeclado.nextInt(); // Leemos el número introducido

        // Imprimimos precio original del producto
        System.out.println("Precio original: " + precioProducto + "€");

        // Imprimimos precio con descuento (20%):
        float precioDescuento = precioProducto * (descuento/100); // true
        System.out.println(" Descuento (20%): " + precioDescuento + "€");

        // Imprimimos precio final:
        float precioFinal = precioProducto - precioDescuento; // true
        System.out.println(" Precio final: " + precioFinal + "€");



        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

    public void ejercicio7() {
    /*
    Operador NOT y condiciones compuestas
    Crea un programa que pida al usuario su edad y si es estudiante (true/false).
    Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes
    descuentos: descuento joven (menor de 26 años),
    descuento estudiante,
    o descuento especial (menor de 26 Y estudiante).
    Ejemplo de salida por consola:
    Introduce tu edad: 24
    ¿Eres estudiante? (true/false): true
    ¿Eres menor de 26 años?: true
    ¿Eres estudiante?: true
    ¿NO eres estudiante?: false
    ¿Tienes descuento joven? (menor de 26): true
    ¿Tienes descuento estudiante?: true
    ¿Tienes descuento especial? (menor de 26 AND estudiante): true
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Pedimos introduzca su edad
        System.out.print(" Introduce tu edad: ");
        int edad = lectorTeclado.nextInt(); // Leemos el número introducido

        // Pedimos si es estudiante
        System.out.print("¿Eres estudiante?:  ");
        boolean estudiante = lectorTeclado.nextBoolean(); // Leemos el true o false

        // Pedimos si es menor de 26
        System.out.print("¿Eres menor de 26 años?: ");
        boolean menorEdad = lectorTeclado.nextBoolean(); // Leemos el true o false

        // Pedimos si no es estuduante
        System.out.print("¿NO eres estudiante?: ");
        boolean noEstudiante= lectorTeclado.nextBoolean(); // Leemos el true o false

        // ¿Tienes descuento joven?
        boolean descuentoJoven = edad < 26; // true
        System.out.println("¿Tienes descuento joven? (menor de 26): " + descuentoJoven);

        // ¿Tienes descuento estudiante?
        boolean carneEstudiante = edad < 26 && estudiante; // true
        System.out.println("¿Tienes descuento estudiante?: " + descuentoJoven);

        // ¿Tienes descuento especial?
        boolean descuentoEspecial = edad < 26 && estudiante; // true
        System.out.println("¿Tienes descuento especial? (menor de 26 AND estudiante): " + descuentoEspecial);




        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

}
