package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class aumento {

    // Regras: Salários até R$ 1000.00, aumento de 20% | Salários entre R$ 1001.00 e R$ 3000.00, aumento de 15%
    //         Salários entre R$ 3001.00 e R$ 8000.00, aumento de 10% | Salários acima R$ 8000.00, aumento de 5%

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int porcentagem;
        double salario, novoSalario, aumento;

        System.out.println ("Digite o salário da pessoa: ");
        salario = sc.nextDouble ();

        if (salario <= 1000) {
            porcentagem = 20;
            aumento = (salario * porcentagem) / 100;
            novoSalario = salario + aumento;
        } else if (salario <= 3000) {
            porcentagem = 15;
            aumento = (salario * porcentagem) / 100;
            novoSalario = salario + aumento;
        } else if (salario <= 8000) {
            porcentagem = 10;
            aumento = (salario * porcentagem) / 100;
            novoSalario = salario + aumento;
        }
        else {
            porcentagem = 20;
            aumento = (salario * porcentagem) / 100;
            novoSalario = salario + aumento;
        }

        System.out.println("---------------------------");
        System.out.printf ("Novo salario = R$ %.2f\n", novoSalario);
        System.out.printf ("Aumento = R$ %.2f\n", aumento);
        System.out.println ("Porcentagem = " + porcentagem + "%");
    }
}
