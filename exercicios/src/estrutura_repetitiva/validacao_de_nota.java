package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class validacao_de_nota {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double pnota, snota, media;

        System.out.println ("Digite a primeira nota: ");
        pnota = sc.nextDouble ();

        while (pnota < 0 || pnota > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            pnota = sc.nextDouble();
        }

        System.out.println ("Digite a segunda nota: ");
        snota = sc.nextDouble ();

        while (snota < 0 || snota > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            snota = sc.nextDouble();
        }

        media = (pnota + snota) / 2;
        System.out.printf("Média = %.2f\n", media);
    }
}
