package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class coordenadas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println ("Valor de X: ");
        x = sc.nextDouble ();
        System.out.println ("Valor de Y: ");
        y = sc.nextDouble ();

        if ((x == 0) && (y == 0)) {
            System.out.println ("-----------------------------");
            System.out.println ("Origem");
        } else if ((x > 0) && (y > 0)) {
            System.out.println ("-----------------------------");
            System.out.println ("Q1");
        } else if ((x < 0) && (y > 0)) {
            System.out.println ("-----------------------------");
            System.out.println ("Q2");
        } else if ((x < 0) && (y < 0)) {
            System.out.println ("-----------------------------");
            System.out.println ("Q3");
        } else if ((x > 0) && (y < 0)) {
            System.out.println ("-----------------------------");
            System.out.println ("Q4");
        } else if (y == 0) {
            System.out.println ("-----------------------------");
            System.out.println ("Eixo X");
        }
        else {
            System.out.println ("-----------------------------");
            System.out.println ("Eixo Y");
        }
    }
}
