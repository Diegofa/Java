import java.util.Scanner;
import java.util.Arrays;

public class ArregloDeIMCs {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.printf("Cuantos IMC quieres introducir?");
        int tam = ent.nextInt();
        double IMCs[] = new double[tam] ;
        //valores inciales
        double minimo = Double.MAX_VALUE;
        double maximo = -Double.MAX_VALUE;
        double promedio = 0.0;

        //Vamos a usar un for para leer los datos
        System.out.println("Introduce los IMCs");
        for (int i = 0; i < IMCs.length; i++){
            IMCs[i] = ent.nextDouble();
            //Calculo de estadisticas
            if (IMCs[i] < minimo) minimo = IMCs[i];
            if (IMCs[i] > maximo) maximo = IMCs[i];
            promedio = promedio + IMCs[i];
        }
        promedio = promedio / tam;
        // sorting array
        Arrays.sort(IMCs);
        //Salidas
        System.out.println("Se introdujeron " + tam);
        System.out.println("IMC ordenados de menor a mayor valor.");
        for (int i = 0; i < IMCs.length; i++)
            System.out.println("IMC # " + i + " :" + IMCs[i]);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Promedio: " + promedio);
    }
}
