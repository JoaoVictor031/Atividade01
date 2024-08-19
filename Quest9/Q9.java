package Quest9;

import java.util.Scanner;

public class Q9 {

    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularArea(raio);

        long areaArredondada = Math.round(area);

        System.out.println("A área do círculo é: " + areaArredondada);
    }
}
