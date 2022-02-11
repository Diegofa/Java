import java.util.Scanner;
import java.util.Arrays;


public class promedioIMCArreglos {
    public static void main(String[] args) {
        System.out.println("Bienvenido al calculo del promedio de los IMC de los estudiantes del grado 5a");
        Scanner valorEntrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes que se van a promediar");
        int cant = valorEntrada.nextInt();
        double array [] =new double[cant];
        double minimo = Double.MAX_VALUE;
        double maximo = -Double.MAX_VALUE;
        double promedio = 0.0;
        System.out.println("Introduce los IMC de los estudiantes");


        for ( int i= 0; i < array.length; i++){
                array[i]= valorEntrada.nextDouble();
                promedio = promedio + array[i];
                if (array[i]<minimo){minimo = array[i];}
                if (array[i]>maximo){maximo= array[i];}

            }
            promedio= promedio/cant;
            Arrays.sort(array);
            System.out.println("Se introdujeron : " + cant);
            System.out.println("Promedio: " + promedio);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);

        }
    }

