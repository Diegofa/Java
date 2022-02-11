import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        ArrayList<Double> IMCs= new ArrayList<Double>();
        double minimo=Double.MAX_VALUE;
        double maximo = -Double.MAX_VALUE;
        int tam= 0;
        double promedio = 0.0;
        double IMC= 0.0;


        System.out.println("Ingresa los IMC");
        System.out.println("Ingresa 0 cuando quieras terminar el ingreso de datos");

        do{
            System.out.println("Ingresa el IMC");
            IMC = entradaDato.nextInt();
            if (IMC !=0){
                if (IMCs.size() >0){
                    int i=0;
                    while ((i < IMCs.size()) && (IMCs.get(i) < IMC)) i++;
                    IMCs.add(i,IMC);
                }else{IMCs.add(IMC);}
            }



        } while (IMC !=0);

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
