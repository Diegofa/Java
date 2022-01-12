import java.io.IOException;
import java.util.Scanner;

public class Compite {
    Atleta atletas [];
    Scanner ent = new Scanner(System.in);
    int candidateAtlas;

    public Compite (int N){
        atletas = new Atleta [N];
        candidateAtlas = 0;
    }
     public void iniciarCompetencia() throws IOException {

         int op = 5;
         do{
             System.out.println("Competencia");
             System.out.println("1. Registrar Atleta");
             System.out.println("2. Datos del campeón");
             System.out.println("3. Atletas por país");
             System.out.println("4. Tiempo promedio de todos los atletas.");
             System.out.println("5. Salir");
             System.out.print("Ingrese la opcion:");
             op = ent.nextInt();
             EvaluarOpcion(op);
         }while(op != 5);

    }
    private void EvaluarOpcion(int op) throws IOException{

        switch (op) {
            case 1: {
                if (candidateAtlas <= atletas.length - 1) {
                    System.out.print("Ingresar Atleta, nombre:");
                    String nombre = ent.nextLine();
                    System.out.print("Nacionalidad:");
                    String nacio = ent.nextLine();
                    System.out.print("Tiempo:");
                    int tiempo = ent.nextInt();
                    atletas[candidateAtlas] = new Atleta(nombre, nacio, tiempo);
                    candidateAtlas++;
                } else {
                    System.out.println("No se puede ingresar más atletas.");
                }
                System.out.println(atletas.length);
            }
            break;
            case 2: {
                int idxAtleta = 0;
                int menorTiempo = 100;
                for (int i = 0; i < atletas.length; i++) {
                    if (menorTiempo > atletas[i].getTime()) {
                        menorTiempo = atletas[i].getTime();
                        idxAtleta = i;
                    }
                }
                System.out.println("El Atleta campeón es: " + atletas[idxAtleta].getNombre());
                System.out.println("Con el tiempo: " + menorTiempo);
            }
            break;
            case 3: {
                System.out.print("Ingrese el país:");
                String pais = ent.nextLine();
                for (int j = 0; j < atletas.length; j++) {
                    if (atletas[j].getNacionalidad().equals(pais)) {
                        System.out.println(atletas[j].getNombre());
                    }
                }
            }
            break;
            case 4: {
                int sumaTiempos = 0;
                for (int k = 0; k < atletas.length; k++) {
                    sumaTiempos = sumaTiempos + atletas[k].getTime();
                }
                double promedio = sumaTiempos / atletas.length;
                System.out.println("El tiempo promedio es:" + promedio);
            }
            break;
        }



    }
}
