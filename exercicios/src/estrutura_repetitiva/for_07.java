package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class for_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int quad = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d%n",i ,quad ,cubo);
        }
        sc.close();
    }
}
