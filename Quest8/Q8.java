package Quest8;

public class Q8 {
    public static boolean verificaPalindromo(String palavra) {
        palavra = palavra.toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        return palavra.equals(invertida);
    }
    public static void main(String[] args) {
        String palavra = "reviver";

        if (verificaPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

    }
}
