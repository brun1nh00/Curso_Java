package arrays;

import java.util.Locale;
import java.util.Scanner;

public class HeightsArrayProg {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMin;
        double totalHeight, avgHeight, smallerPercentage;
        System.out.print("How many people will be entered: ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------------");
            System.out.println("Enter the data of the " + (i + 1) + "º person:");
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        nMin = 0;
        totalHeight = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                nMin++;
            }
            totalHeight = totalHeight + height[i];
        }

        avgHeight = totalHeight / n;
        smallerPercentage = ((double) nMin / n) * 100;

        System.out.printf("\nAverage height: %.2f%n", avgHeight);
        System.out.printf("Smaller percentage of people under 16 years old: %.1f%%\n", smallerPercentage);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();

    }
}
