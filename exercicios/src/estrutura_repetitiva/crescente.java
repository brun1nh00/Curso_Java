package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class crescente {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println ("Digite dois números: ");
        num1 = sc.nextInt ();
        num2 = sc.nextInt ();

        while (num1 != num2) {
            if (num1 < num2) {
                System.out.println ("Crescente!");
            }
            else {
                System.out.println ("Decrescente.");
            }
            System.out.println ("-----------------------------");
            System.out.println ("Digite outros dois números: ");
            num1 = sc.nextInt ();
            num2 = sc.nextInt ();
        }
    }
}
