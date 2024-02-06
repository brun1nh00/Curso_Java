package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class troco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int qtde;
        double preco, recebido, troco;

        System.out.println("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.println("Quantidade comprada: ");
        qtde = sc.nextInt();
        System.out.println("Dinheiro recebido: ");
        recebido = sc.nextDouble();

        troco = recebido - (preco * qtde);

        System.out.printf("Troco = %.2f\n",troco);
    }
}
