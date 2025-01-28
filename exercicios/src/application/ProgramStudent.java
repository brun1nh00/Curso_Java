package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("First trimester grade: ");
        double grade1 = sc.nextDouble();
        System.out.print("Second trimester grade: ");
        double grade2 = sc.nextDouble();
        System.out.print("Third trimester grade: ");
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.println();
        System.out.println(student);

        sc.close();
    }
}
