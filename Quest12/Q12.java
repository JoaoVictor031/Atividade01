package Quest12;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotal = 0;
        int numTanques = 0;

        while (true) {
            System.out.print("Digite a quilometragem dirigida (ou um número negativo para sair): ");
            int quilometragem = scanner.nextInt();

            if (quilometragem < 0) {
                break;
            }

            System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            if (litros <= 0) {
                System.out.println("A quantidade de litros deve ser um número positivo.");
                continue;
            }

            double consumo = (double) quilometragem / litros;
            System.out.printf("Consumo para este tanque: %.2f km/l\n", consumo);

            quilometragemTotal += quilometragem;
            litrosTotal += litros;
            numTanques++;
        }

        if (numTanques > 0) {
            double mediaConsumo = (double) quilometragemTotal / litrosTotal;
            System.out.printf("Quilometragem combinada: %d km\n", quilometragemTotal);
            System.out.printf("Total de litros consumidos: %d litros\n", litrosTotal);
            System.out.printf("Média de consumo: %.2f km/l\n", mediaConsumo);
        } else {
            System.out.println("Nenhum dado válido foi inserido.");
        }

        scanner.close();
    }
}
