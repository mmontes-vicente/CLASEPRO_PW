import java.util.Scanner;

public class Ejercicio {
    private Scanner lectorTeclado;

    public void Ejercicio1{
        lectorTeclado = new Scanner(System.in);

        System.out.println("Cuantas bebidas vas a comprar");

        int bebidas = lectorTeclado.nextInt();

        System.out.println("Cuantas bocatas vas a comprar");

        int bocatas = lectorTeclado.nextInt();

        lectorTeclado.close();
    }

    public void Ejercicio2 (){

    }
}
