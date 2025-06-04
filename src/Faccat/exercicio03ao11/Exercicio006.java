package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner areaQuadradoScanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retangulo");
        double base = areaQuadradoScanner.nextDouble();

        System.out.println("Digite o valor da altura do retangulo");
        double altura = areaQuadradoScanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retangulo é "+ area);
        areaQuadradoScanner.close();
    }
}
