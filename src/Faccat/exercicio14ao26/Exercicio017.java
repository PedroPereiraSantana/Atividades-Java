package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();

        double notaFinal = (nota1 + nota2) / 2;

        String resposta = notaFinal > 5 ? "Aluno aprovado" : "Aluno reprovado";

        System.out.println(resposta);
    }
}
