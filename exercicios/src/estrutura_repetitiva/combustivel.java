package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class combustivel {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("Informe o código do combustível:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            System.out.println("-----------------------------------------------");
            System.out.println();

            codigo = sc.nextInt();

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break;
            } else {
                System.out.println("Código inválido! Tente novamente.");
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}