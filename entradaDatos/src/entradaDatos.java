import java.util.Scanner;

public class entradaDatos {
    public static void main(String[] args) {
        System.out.println("Ingrese su color favorito");
        Scanner entradaDato = new Scanner(System.in);
        String color= entradaDato.nextLine();
        System.out.println("El color ingresado es:" + color);
        System.out.println(color.toUpperCase().contains("verde".toUpperCase()));

    }
}
