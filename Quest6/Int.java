package Quest6;

public class Int {
    public static void main(String[] args) {
        int produto = 1;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
            }
        }

        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + produto);
    }
}