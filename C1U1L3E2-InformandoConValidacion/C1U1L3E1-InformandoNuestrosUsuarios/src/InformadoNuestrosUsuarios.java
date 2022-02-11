import java.util.Scanner;
public class InformadoNuestrosUsuarios {
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
        //Clasificacion de Obesidad segun el IMC
        String clasificacion = new String();
        if (IMC < 18.5){
            clasificacion = "Bajo de Peso";
        } else if (IMC >= 18.5 && IMC <= 24.9){
            clasificacion = "Normal";
        } else if (IMC >= 25.0 && IMC <= 29.9){
            clasificacion = "PreObesidad";
        } else if (IMC >= 30.0 && IMC <= 34.9){
            clasificacion = "Obesidad de clase I";
        } else if (IMC >= 35.0 && IMC <= 39.9){
            clasificacion = "Obesidad de clase II";
        } else if (IMC >= 40.0){
            clasificacion = "Obesidad de clase III";
        }
        System.out.println("Según la Organización Mundial de la Salud (OMS)");
        System.out.println("tu peso se clasifica como: " + clasificacion);
    }
}
