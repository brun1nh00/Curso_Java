package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i : vect) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");

        for (int j : vect) {
            if (j < 0) {
                System.out.printf("%d\n", j);
            }
        }

        sc.close();
    }
}
