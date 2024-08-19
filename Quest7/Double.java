package Quest7;

public class Double {

    public static void main(String[] args) {
        System.out.println("Divisão por 2 dos múltiplos de 3, entre 1 e 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultado = i / 2.0;
                System.out.println("i = " + i + " -> " + resultado);
            }
        }
    }
}
