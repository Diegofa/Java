import java.util.Scanner;
public class Angulos {
    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        System.out.println("Ingresa el valor del ángulo que quieres consultar");
        int angulo= entradaDato.nextInt();
         if (angulo >= 0 && angulo <= 90){
             System.out.println("Es un ángulo : Agúdo");
            } else if (angulo == 90) {
                System.out.println("Es un  angulo : Recto");
                } else if (angulo >= 91 && angulo < 180){
                     System.out.println("Es un ángulo : Obtuso");
                     } else if(angulo == 180){
                        System.out.println("Es un ángulo : Llano");
                        } else if (angulo >= 181 && angulo <= 360){
                            System.out.println("Es un ángulo : Concavo");
                            }else if (angulo == 360) {
                                System.out.println("Es un ángulo : Completo");
                                  }else {
                                    System.out.println("Angulo no existe");
                                    }
    }
}
