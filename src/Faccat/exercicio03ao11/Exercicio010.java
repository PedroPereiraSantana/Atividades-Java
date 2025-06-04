package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de fábrica do carro");
        double carroBase = scanner.nextDouble();

        double valorTotal = carroBase / 100 * 28 + carroBase / 100 * 45 + carroBase;

        System.out.println("O valor do carro já com as taxas ficaria R$ "+ valorTotal);
    }
};
