package Quest6;

public class Float {
    public static void main(String[] args) {
        float produto = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
            }
        }
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + produto);
    }
}