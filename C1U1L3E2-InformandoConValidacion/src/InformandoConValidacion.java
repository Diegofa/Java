import java.util.Scanner;

public class InformandoConValidacion {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = ent.nextLine();
        double peso;
        do {
            System.out.println("Introduce tu peso (en Kg)");
            while (!ent.hasNextDouble()) {
                String entrada = ent.next();
                System.out.println(entrada + " es un Dato Invalido, debe ser un numero real. ¡Intentalo de nuevo!");
                System.out.println("Introduce tu peso (en Kg)");
            }
            peso = ent.nextDouble();
        } while (peso < 0);

        double altura;
        do {
            System.out.println("Introduce tu altura (en m)");
            while (!ent.hasNextDouble()) {
                String entrada = ent.next();
                System.out.println(entrada + " es un Dato Invalido, debe ser un numero real. ¡Intentalo de nuevo!");
                System.out.println("Introduce tu altura (en m)");
            }
            altura = ent.nextDouble();
        } while (altura < 0);

        //Calculo del IMC
        double IMC = peso / (altura * altura) ;
        System.out.println("¡Hola " + nombreUsuario + "!");
        System.out.println("Tu Indice de Masa Corporal es: " + IMC);

    }
}