package arrays;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, evenNumbers;

        System.out.print("How many numbers will be entered: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "º number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nEven numbers entered:");

        evenNumbers = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d ", numbers[i]);
                evenNumbers++;
            }
        }

        System.out.printf("\n\nTotal of even numbers: %d\n", evenNumbers);

        sc.close();
    }
}
