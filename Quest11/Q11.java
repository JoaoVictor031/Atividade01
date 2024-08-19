package Quest11;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Palavras organizadas em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Palavras organizadas em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras informadas são iguais.");
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A maior palavra informada é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A maior palavra informada é: " + palavra2);
        } else {
            System.out.println("As duas palavras têm o mesmo tamanho.");
        }
    }
}
