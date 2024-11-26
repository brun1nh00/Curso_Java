package estrutura_repetitiva;

import java.util.Scanner;

public class for_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int a=1; a<=x; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }

        sc.close();
    }
}