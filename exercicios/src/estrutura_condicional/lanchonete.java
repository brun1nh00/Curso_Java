package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;

        double valor, valorFinal;

        sc.nextLine ();
        System.out.println ("Código do produto comprado: ");
        codigo = sc.nextInt ();
        
        System.out.println("Quantidade comprada: ");
        quantidade = sc.nextInt ();

        if (codigo == 1) {
            valor = 5.00;
            valorFinal = valor * quantidade;
            System.out.println ("--------------------");
            System.out.printf("Valor a pagar: %.2f\n", valorFinal);

        } else if (codigo == 2) {
            valor = 3.50;
            valorFinal = valor * quantidade;
            System.out.println ("--------------------");
            System.out.printf("Valor a pagar: %.2f\n", valorFinal);

        } else if (codigo == 3) {
            valor = 4.80;
            valorFinal = valor * quantidade;
            System.out.println ("--------------------");
            System.out.printf("Valor a pagar: %.2f\n", valorFinal);

        } else if (codigo == 4) {
            valor = 8.90;
            valorFinal = valor * quantidade;
            System.out.println ("--------------------");
            System.out.printf("Valor a pagar: %.2f\n", valorFinal);

        } else if (codigo == 5) {
            valor = 15.00;
            valorFinal = valor * quantidade;
            System.out.println ("--------------------");
            System.out.printf("Valor a pagar: %.2f\n", valorFinal);
        }
        else System.out.println("Código Inexistente.");

    }
}
