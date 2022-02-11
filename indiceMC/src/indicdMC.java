import java.util.Scanner;
public class indicdMC {
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre: ");
        Scanner valorEntrada= new Scanner(System.in);
        String nombre = valorEntrada.nextLine();
        System.out.println("Ingresa tu talla en centimetros: ");
        double talla = valorEntrada.nextDouble();
        System.out.println("Ingresa tu peso en kilogramos: ");
        double peso= valorEntrada.nextDouble();
        double IMC = (peso / (talla* talla));

        System.out.println(IMC);

        if (IMC < 18.5)
        {
            System.out.println("Hola : "+ nombre +" "+"Tu peso es : Bajo");
        }else if ( IMC >= 18.5 && IMC <= 24.9)
        {
            System.out.println("Hola : "+ nombre +" "+"Tu peso es : Normal");
        }else if (IMC >= 25.0 && IMC <= 29.9)
        {
            System.out.println("Hola : "+ nombre +" "+"Tu peso es : Obeso 1");
        } else if (IMC >= 310.1)
        {
            System.out.println("Hola : "+ nombre +" "+"Tu peso es : Obeso Clase 2 o más");
        } else
            {
                System.out.println("Hola : "+ nombre +" "+"Debes ingresar valores válidos");
            }
    }
}
