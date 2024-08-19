package Quest10;

import java.util.Scanner;

public class Q10 {

    public static void contarCaracteres(String texto) {
        int vogais = 0, consoantes = 0, espacos = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
            else if (c == ' ') {
                espacos++;
            }
            else if (c >= 'a' && c <= 'z') {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços em branco: " + espacos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        contarCaracteres(texto);
    }
}
