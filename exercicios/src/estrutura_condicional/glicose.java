package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class glicose {

    //Glicose <= 100 - Normal | Glicose <= 140 - Elevado | Glicose > 140 - Diabetes

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double medida;

        System.out.println("Digite a medida da glicose: ");
        medida = sc.nextDouble();

        if (medida <= 100) {
            System.out.println("Classificação: Normal");
        } else if (medida <= 140) {
            System.out.println("Classificação: Elevado");
        }
        else {
            System.out.println("Classificação: Diabetes");
        }
    }
}
