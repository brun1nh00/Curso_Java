package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class multiplos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int int1, int2;

        System.out.println ("Digite dois números inteiros: ");
        int1 = sc.nextInt();
        int2 = sc.nextInt();

        if ((int1 % int2 == 0) || (int2 % int1 == 0)) {
            System.out.println ("São multiplos!");
        }
        else System.out.println ("Não são multiplos.");
    }
}
