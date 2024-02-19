package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.println ("Digite a senha: ");
        senha = sc.nextInt ();

        while (senha != 2002) {
            System.out.println("Senha Inválida! Tente novamente: ");
            senha = sc.nextInt ();
        }

        System.out.println("Acesso Permitido!");
    }
}
