package Quest4;

import java.util.Scanner;
public class Q4{


    public static double converteMinlhasQuil(double milhas) {
        return milhas * 1.609;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();


        double quilometros = converteMinlhasQuil(milhas);


        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");


        scanner.close();
    }
}
