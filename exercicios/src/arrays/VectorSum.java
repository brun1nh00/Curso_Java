package arrays;

import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will have each vector? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the A vector values: ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        System.out.println("Enter the B vector values: ");

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Resulting Vector: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", c[i]);
        }

        sc.close();
    }
}