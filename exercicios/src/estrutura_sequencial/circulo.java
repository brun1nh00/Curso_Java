package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class circulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, pi, area;
        pi = 3.14159;

        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * (raio + raio);

        System.out.printf("Área do círculo = %.3f", area);
    }
}
