package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio006_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do Raio do circulo");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.pow(raio, 2) * Math.PI;

        System.out.println("A área do circulo é "+ areaCirculo);
    }
}
