import java.util.Scanner;
public class ImprimiendoStrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = ent.next();
        System.out.println("Introduce Apellido");
        String apellidoUsuario = ent.next();
        //Creamos un String con el nombre completo
        String identificacionUsuario = nombreUsuario.toLowerCase() + " " + apellidoUsuario.toUpperCase();
        //Imprimamos el nombre en minusculas y el apellido en mayusculas
        System.out.println("¡Hola " + identificacionUsuario + "!");
        //Imprimamos las Iniciales del Usuario
        System.out.println("Tus iniciales son: " + nombreUsuario.charAt(0)+apellidoUsuario.charAt(0));
    }
}
