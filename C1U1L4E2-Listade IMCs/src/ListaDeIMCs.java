import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ListaDeIMCs {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //Lista de doubles implementada con ArrayList
        ArrayList<Double> IMCs = new ArrayList<Double>();
        //valores inciales
        double minimo = Double.MAX_VALUE;
        double maximo = -Double.MAX_VALUE;
        double promedio = 0.0;
        double IMC= 0.0;
        int tam;

        //Vamos a usar un for para leer los datos
        System.out.println("Ve introduciendo los IMCs");
        System.out.println("Introduce cero, cuando quieras parar");
        do{ //Debes introducir al menos un dato
            System.out.println("IMC?");
            IMC = ent.nextInt();
            if (IMC != 0){//Si es cero, se termino la introduccion de datos
                //Antes de insertarlo en la lista, debemos ver donde hacerlo,
                // de tal manera que siempre este ordenada de menor a mayor
                if (IMCs.size() > 0) {// Se ha insertado al menos un elemento
                    int i = 0;
                    while ((i < IMCs.size()) && (IMCs.get(i) < IMC)) i++;
                    IMCs.add(i,IMC);
                }else {// Es el unico elemento, no hay contra que compararlo
                    IMCs.add(IMC);
                }
            }
        } while (IMC != 0);

        //Ahora vamos a imprimirlos todos y sacar las estadisticas
        tam = IMCs.size();
        System.out.println("Se introdujeron " + tam);
        System.out.println("IMC ordenados de menor a mayor valor.");
        for (int i = 0; i < IMCs.size(); i++){
            IMC = IMCs.get(i);
            System.out.println("IMC # " + i + " :" + IMC);
            //Calculo de estadisticas
            if (IMC < minimo) minimo = IMC;
            if (IMC > maximo) maximo = IMC;
            promedio = promedio + IMC;
        }
        promedio = promedio / tam;
        //Impresion de estadisticas
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Promedio: " + promedio);
    }
}
