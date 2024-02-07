package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double a, b, c, areaQ, areaTri, areaTra;

        sc.nextLine();
        System.out.println("Digite a medida A: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a medida B: ");
        b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a medida C: ");
        c = sc.nextDouble();

        areaQ = a * a;
        areaTri = (b * a) / 2;
        areaTra = ((a + b) * c) / 2;

        System.out.println("----------------------------------");
        System.out.printf("A área do quadrado é: %.4f%n", areaQ);
        System.out.printf("A área do triângulo é: %.4f%n", areaTri);
        System.out.printf("A área do trapézio é: %.4f%n", areaTra);
    }
}
