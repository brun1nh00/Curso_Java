package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double media;

        System.out.println("Dados da primeira pessoa:");
        System.out.println();
        System.out.println ("Nome: ");
        String nome1 = sc.nextLine();
        System.out.println ("Idade: ");
        int idade1 = sc.nextInt();

        System.out.println("-------------------------------");
        sc.nextLine();

        System.out.print("Dados da segunda pessoa:");
        System.out.println();
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        media = (double) (idade1 + idade2) / 2;

        System.out.printf("A idade media de %s e %s é de %.1f anos.", nome1, nome2, media);
    }
}
