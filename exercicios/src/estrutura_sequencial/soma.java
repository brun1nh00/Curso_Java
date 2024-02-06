package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("A soma de X e Y é: " + soma);
    }
}
