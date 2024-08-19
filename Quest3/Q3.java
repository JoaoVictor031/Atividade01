package Quest3;

import java.util.Scanner;
public class Q3{
    public static boolean verificaPrimo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int cont = 0;


        System.out.println("Números primos menores que " + num + ":");


        for (int i = num; i <= num; i--) {
            if (verificaPrimo(i)) {
                System.out.println(i);
                cont++;
            }
        }
        if (cont == 0){
            System.out.println("O número informado não tem antecessores primos");
        }
        scanner.close();
    }
}
