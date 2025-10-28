public class Entrada {

    public static void main(String[] args) {

        System.out.println("Ejecución de metodos");
        saludar("Borja");
        despedir();

        /*int numero1=7;
        int numero2=4;
        int suma= numero1+numero2;

        System.out.println(suma);

        numero1=17;
        numero2=24;
        suma = numero1+numero2;

        System.out.println(suma);*/
        Operaciones operacionesMetodos = new Operaciones();
        operacionesMetodos.sumar(4,7);
        operacionesMetodos.restar(12,7);
        operacionesMetodos.dividir(4,2);
        operacionesMetodos.multiplicar(4,2);

    }

    public static void saludar(String data){
        System.out.println("Hola " +data);
        System.out.println("Este metodo se va a repetir en el saludo");
    }

    public static void despedir(){
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");

    }
}
