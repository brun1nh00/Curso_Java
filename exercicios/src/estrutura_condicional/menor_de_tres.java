package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int primeiroValor, segundoValor, terceiroValor, menor;

        System.out.println("Primeiro valor: ");
        primeiroValor = sc.nextInt();
        System.out.println("Segundo valor: ");
        segundoValor = sc.nextInt();
        System.out.println("Terceiro valor: ");
        terceiroValor = sc.nextInt();

        if ((primeiroValor < segundoValor) && (primeiroValor < terceiroValor)) {
            menor = primeiroValor;
        } else if ((segundoValor < primeiroValor) && (segundoValor < terceiroValor)) {
            menor = segundoValor;
        }
        else {
            menor = terceiroValor;
        }

        System.out.println ("Menor: " + menor);
    }
}
