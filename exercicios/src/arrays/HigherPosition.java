package arrays;

import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, position;
        double higher;

        System.out.print("How many numbers will be entered: ");
        n = sc.nextInt();

        double[] numbers = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "º number: ");
            numbers[i] = sc.nextDouble();
        }

        higher = numbers[0];
        position = 0;

        for(int i = 0; i < n; i++) {
            if (numbers[i] > higher) {
                higher = numbers[i];
                position = i;
            }
        }

        System.out.println("--------------------");
        System.out.printf("Higher Number: %.1f\n", higher);
        System.out.printf("Position of higher number: %d\n", position);

        sc.close();
    }
}
