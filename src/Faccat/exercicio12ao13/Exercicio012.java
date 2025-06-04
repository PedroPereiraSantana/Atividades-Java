package Faccat.exercicio12ao13;
import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os graus em Celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("O valor convertido em Celsius convertido em Fahrenheit "+ fahrenheit + " Fº");
    }
}
