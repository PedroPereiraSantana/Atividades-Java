package Faccat.exercicio27ao38;
import java.util.Scanner;

public class Exercicio027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double numero = scanner.nextDouble();

        if (numero == 0) {
            System.out.println("O número digitado é zero");
        } else if (numero > 0) {
            System.out.println("O número digitado é positivo");
        } else {
            System.out.println("O número digitado é negativo");
        }
    }
}
