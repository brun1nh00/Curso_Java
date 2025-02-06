package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}
