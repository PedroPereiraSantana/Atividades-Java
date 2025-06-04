package Faccat.exercicio3ao11;
import java.util.Scanner;

public class Exercicio006_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de um dos lados do quadrado");
        double lado = scanner.nextDouble();

        double areaTotal = lado * 4;

        System.out.println("A área total do quadrado "+ areaTotal + " CM²");

    }
}
