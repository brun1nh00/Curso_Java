package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum, avg;

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i];
        }

        avg = sum / n;

        System.out.print("Values: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", avg);

        sc.close();
    }
}
