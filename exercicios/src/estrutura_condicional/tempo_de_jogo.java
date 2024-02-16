package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;

        System.out.println ("Hora Inicial: ");
        horaInicial = sc.nextInt ();

        System.out.println ();

        System.out.println ("Hora Final: ");
        horaFinal = sc.nextInt ();

        if (horaInicial < horaFinal) {
            System.out.println ("-----------------------------");
            System.out.printf("O jogo durou %d hora(s)\n", horaFinal - horaInicial);
        }
        else {
            System.out.println ("-----------------------------");
            System.out.printf("O jogo durou %d hora(s)\n", 24 - (horaInicial - horaFinal));
        }
    }
}
