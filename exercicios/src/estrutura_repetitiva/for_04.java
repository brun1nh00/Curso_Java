package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class for_04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            double a = sc.nextInt();
            double b = sc.nextInt();
            double formula = a / b;

            if (b == 0) {
                System.out.println("Divisão Impossível!");
            }

            System.out.println(formula);
        }

        sc.close();
    }
}
