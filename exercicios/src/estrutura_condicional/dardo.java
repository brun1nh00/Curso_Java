package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class dardo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double d1, d2, d3, maior;

        System.out.println ("Digite as três distâncias: ");
        d1 = sc.nextDouble ();
        d2 = sc.nextDouble ();
        d3 = sc.nextDouble ();

        if ((d1 > d2) && (d1 > d3)) {
            maior = d1;
        } else if ((d2 > d1) && (d2 > d3)) {
            maior = d2;
        }
        else maior = d3; {
        }

        System.out.println ("------------------------------");
        System.out.println ("Maior Distância: " + maior);
    }
}
