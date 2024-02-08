package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double c, f;
        char temperatura;

        System.out.println("Você vai digitar a temperatura em qual escala (C/F)? ");
        temperatura = sc.next().charAt(0);

        System.out.println();

        if ((temperatura == 'C') || (temperatura =='c')) {
            System.out.println("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();

            System.out.println("---------------------");

            f = c * 9.0 / 5.0 + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", f);

        } else if ((temperatura == 'F') || (temperatura =='f')) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            f = sc.nextDouble();

            System.out.println("---------------------");

            c = 5.0 / 9.0 * (f - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", c);
        }
        else System.out.println("---------------------");
            System.out.println("Caractere Inválido!");
    }
}
