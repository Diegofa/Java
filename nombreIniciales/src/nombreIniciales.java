import java.util.Scanner;
public class nombreIniciales {
    public static void main(String[] args) {
        System.out.println("Ingrese su Nombre");
        Scanner entrada= new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su Apellido");
        String apellido= entrada.nextLine();
        System.out.println("El nombre completo que ingresado es: "+ nombre.toLowerCase()+" "+ apellido.toUpperCase());
        System.out.println("Las iniciales de su nombre son: " + nombre.toUpperCase().charAt(0)+" "+apellido.toUpperCase().charAt(0));

    }
}
