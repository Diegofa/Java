import java.io.IOException;
import java.util.Scanner;

public class CompetenciaPpal {
    public static void main(String[] args) throws IOException {
        Scanner numAtle = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de atletas");
        int N = numAtle.nextInt();
        Compite competencia = new Compite(N);
        competencia.iniciarCompetencia();


    }
}
