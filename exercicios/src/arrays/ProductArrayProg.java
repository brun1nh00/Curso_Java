package arrays;

import entities.ProductArray;

import java.util.Locale;
import java.util.Scanner;

public class ProductArrayProg {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductArray[] vect = new ProductArray[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductArray(name, price);
        }

        double sum = 0;
        for (ProductArray productArray : vect) {
            sum += productArray.getPrice();
        }
        double avg = sum / n;

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();
    }
}
