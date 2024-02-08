package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double preco, pago, resto, valorCompra;
        int quantidade;

        System.out.println ("Preço unitário do produto: ");
        preco = sc.nextDouble ();
        System.out.println ("Quantidade comprada: ");
        quantidade = sc.nextInt ();
        System.out.println ("Dinheiro recebido: ");
        pago = sc.nextDouble ();

        valorCompra = preco * quantidade;

        if (pago > valorCompra) {
            resto = pago - valorCompra;
            System.out.printf("Troco: %.2f", resto);
        }
        else {
            resto = valorCompra - pago;
            System.out.printf("Dinheiro Insuficiente. Faltam R$ %.2f", resto);
        }
    }
}
