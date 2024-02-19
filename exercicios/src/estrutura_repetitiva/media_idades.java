package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double media, soma;

        int idades, nPessoas;

        System.out.println ("Digite as idades: ");
        idades = sc.nextInt ();

        if (idades < 0) {
            System.out.println ("Impossível Calcular!");
        }
        else {
            soma = 0;
            nPessoas = 0;

            while (idades >= 0) {
                soma = soma + idades;
                nPessoas++;
                idades = sc.nextInt ();
            }

            System.out.println("--------------------------");
            media = soma / nPessoas;

            System.out.printf ("Média = %.2f\n", media);
        }
    }
}
