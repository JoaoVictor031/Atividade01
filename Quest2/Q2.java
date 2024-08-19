package Quest2;

import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();


        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();


        double maiorValor = obterMaiorValor(num1, num2);


        System.out.println("O maior valor informado é: " + maiorValor);


        scanner.close();
    }

    public static double obterMaiorValor(double valor1, double valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
