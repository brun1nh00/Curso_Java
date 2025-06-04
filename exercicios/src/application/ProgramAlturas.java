package application;

import entities.Alturas;

import java.util.Locale;
import java.util.Scanner;
public class ProgramAlturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered: ");
        int n = sc.nextInt();

        Alturas[] people = new Alturas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------------");
            System.out.println("Enter the data of the " + (i + 1) + "º person:");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.println("------------------------------------");

            people[i] = new Alturas(name, age, height);
        }

        double totalHeight = 0.0;
        for (int i = 0; i < n; i++) {
            totalHeight += people[i].getHeight();
        }
        double averageHeight = totalHeight / n;

        int countUnder16 = 0;
        for (int i = 0; i < n; i++) {
            if (people[i].getAge() < 16) {
                countUnder16++;
            }
        }

        double percentageUnder16 = (double) countUnder16 / n * 100.0;

        System.out.printf("\nAverage height: %.2f%n", averageHeight);
        System.out.printf("Percentage of people under 16: %.1f%%%n", percentageUnder16);

        if (countUnder16 > 0) {
            System.out.println("Names of people under 16:");
            for (int i = 0; i < n; i++) {
                if (people[i].getAge() < 16) {
                    System.out.println(people[i].getName());
                }
            }

        }

        sc.close();
    }
}