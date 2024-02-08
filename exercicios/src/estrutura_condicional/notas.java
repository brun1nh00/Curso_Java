package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class notas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double primeiraNota, segundaNota, notaFinal;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();

        notaFinal = primeiraNota + segundaNota;

        if (notaFinal >= 60.00) {
            System.out.printf("Nota Final: %.1f\n", notaFinal);
            System.out.println("Aprovado");
        }
        else {
            System.out.printf("Nota Final: %.1f\n", notaFinal);
            System.out.println("Reprovado");
        }
    }
}
