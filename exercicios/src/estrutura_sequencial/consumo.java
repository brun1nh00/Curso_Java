package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double gasto, consumo;
        int distancia;

        System.out.println("Distância percorrida: ");
        distancia = sc.nextInt();

        System.out.println("Combustível gasto: ");
        gasto = sc.nextDouble();

        consumo = distancia / gasto;

        System.out.printf("O consumo médio é de: %.3f", consumo);
    }
}
