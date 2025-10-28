import java.sql.SQLOutput;
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


        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        double division = (double)numero1/numero2;
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

    public void ejercicio4SinIf() {
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
        System.out.println("Introduce un número: ");
        int numero = lectorTeclado.nextInt(); // Leemos el número introducido

        // Calculamos el resto de dividir entre 2
        if ( numero %2 != 0 ){
            System.out.println("El número "+ numero + " es impar (resto al dividir entre 2: 1) ");
        } else{
            System.out.printf("El número %d es par", numero);
        }

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

    public void ejercicio8() {
    /*
    Operaciones combinadas
    Desarrolla un programa que pida tres números al usuario y calcule:
    la suma de los tres, el promedio, el resultado de multiplicar el primero por el
    segundo y dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de
    operadores.
    Ejemplo de salida por consola:
    Introduce el primer número: 10
    Introduce el segundo número: 5
    Introduce el tercer número: 2
    Suma de los tres números: 15
    Promedio: 5.0
    Resultado de (número1 * número2) / número3: 25.0
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Pedimos Introduce el primer número
        System.out.print(" Introduce el primer número: ");
        int n1 = lectorTeclado.nextInt(); // Leemos el número introducido

        // Pedimos Introduce el segundo número
        System.out.print("Introduce el segundo número:  ");
        int n2 = lectorTeclado.nextInt(); // Leemos el true o false

        // Pedimos Introduce el tercer número
        System.out.print("Introduce el tercer número: ");
        int n3 = lectorTeclado.nextInt(); // Leemos el true o false

        // Suma de los tres números:
        int sumaNumeros = n1 + n2 + n3;
        System.out.println("Suma de los tres números: " + sumaNumeros);

        // Promedio:
        double promedio = (double)sumaNumeros / 3;
        System.out.println("Promedio: " + promedio);

        // Resultado de (número1 * número2) / número3:
        double respuesta = (double)(n1 * n2) / n3;
        System.out.println("Resultado de (número1 * número2) / número3: " + respuesta);


        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

    public void ejercicio9() {
    /*
    Sistema de calificaciones
    Escribe un programa que pida al usuario la puntuación de tres exámenes.
    Calcula la nota media y usa operadores relacionales para determinar si ha aprobado
    (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.
    Ejemplo de salida por consola:
    Introduce la nota del primer examen: 8
    Introduce la nota del segundo examen: 7
    Introduce la nota del tercer examen: 9
    Nota media: 8.0
    ¿Ha aprobado? (>=5): true
    ¿Tiene notable? (>=7): true
    ¿Tiene sobresaliente? (>=9): false
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Introduce la nota del primer examen:
        System.out.print(" Introduce la nota del primer examen: ");
        int nota1 = lectorTeclado.nextInt();

        // Introduce la nota del segundo examen:
        System.out.print("Introduce la nota del segundo examen:  ");
        int nota2 = lectorTeclado.nextInt();

        // Introduce la nota del tercer examen:
        System.out.print("Introduce la nota del tercer examen: ");
        int nota3 = lectorTeclado.nextInt();

        // Nota media:
        double notaMedia = (double)(nota1 + nota2 + nota3) / 3;
        System.out.println("Nota media: " + notaMedia);

        //¿Ha aprobado? (>=5):
        boolean aprobado = notaMedia >=5;
        System.out.println("¿Ha aprobado? (>=5): " + aprobado);

        //¿Tiene notable? (>=7): true
        boolean notable = notaMedia >=7;
        System.out.println("¿Tiene notable? (>=7): " + notable);

        //¿Tiene sobresaliente? (>=9): false
        boolean sobresaliente = notaMedia >=9;
        System.out.println("¿Tiene sobresaliente? (>=9): " + sobresaliente);

        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }

    public void ejercicio10(int horas) {
    /*
    Calculadora de salario con condiciones
    Crea un programa que pida el salario base por hora,
    las horas trabajadas
    y si ha hecho horas extra (true/false).

    Si ha hecho horas extra y trabajó más de 40 horas,
    las horas que excedan de 40 se pagan al doble.

    Usa operadores lógicos, relacionales y
    aritméticos para calcular el salario total.

    Ejemplo de salida por consola:
    Introduce el salario por hora: 10
    Introduce las horas trabajadas: 45
    ¿Has hecho horas extra? (true/false): true
    Horas normales (máximo 40): 40
    Horas extra: 5
    ¿Trabajaste más de 40 horas?: true
    ¿Tienes derecho a horas extra?: true
    ¿Se aplican horas extra? (>40 AND permitido): true
    Salario por horas normales: 400.0€
    Salario por horas extra (al doble): 100.0€
    Salario total: 500.0€
    */

        // Creamos un objeto Scanner para leer la entrada del usuario
        lectorTeclado = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Introduce el salario por hora: ");
        int salarioHora = lectorTeclado.nextInt();

        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = lectorTeclado.nextInt();

        System.out.println("¿Has hecho horas extra? (true/false): ");
        boolean horasExtras = lectorTeclado.nextBoolean();

        int salarioTotal=0;
        salarioTotal+= horas +salarioHora;

        if(horasExtras && horasTrabajadas>horas){
            int numeroHorasExtras = horasTrabajadas-horas;
            salarioTotal = numeroHorasExtras * (salarioHora*2);

        }
        salarioTotal+= 40 *salarioHora;
        System.out.println("El salario cobrado este mes es " + salarioTotal);



        // Cerramos el Scanner (buena práctica)
        lectorTeclado.close();
    }



}
