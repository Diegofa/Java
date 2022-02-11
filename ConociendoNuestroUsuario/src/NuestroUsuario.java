import java.util.Scanner;
public class NuestroUsuario {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = ent.nextLine();
        System.out.println("Introduce tu peso (en Kg)");
        double peso = ent.nextDouble();
        System.out.println("Introduce tu altura (en m)");
        double altura = ent.nextDouble();
        //Calculo del IMC
        double IMC = peso / (altura * altura) ;
        System.out.println("¡Hola " + nombreUsuario + "!");
        System.out.println("Tu Indice de Masa Corporal es: " + IMC);
    }
}

