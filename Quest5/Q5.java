package Quest5;

import java.util.Scanner;

public class Q5 {
    public static String verDiaDaSemana(int numero) {
        String[] diasDaSemana = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };

        if (numero >= 1 && numero <= 7) {
            return diasDaSemana[numero - 1];
        } else {
            return "O número inserido é inválido! Por favor, insira um número entre 1 e 7.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int numero = scanner.nextInt();

        String diaDaSemana = verDiaDaSemana(numero);
        System.out.println("O dia correspondente é: " + diaDaSemana);

        scanner.close();
    }
}
