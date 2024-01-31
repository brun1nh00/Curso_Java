package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.println("Altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (base + altura) * 2;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Area: %.4f%n", area);
        System.out.printf("Perimetro: %.4f%n", perimetro);
        System.out.printf("Diagonal: %.4f%n", diagonal);
    }
}
