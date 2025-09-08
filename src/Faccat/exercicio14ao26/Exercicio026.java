package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque");
        int quantidadeAtual = scanner.nextInt();

        System.out.println("Digite a quantidade minima de estoque");
        int quantidadeMinima = scanner.nextInt();

        System.out.println("Digite a quantidade maxima do estoque");
        int quantidadeMaxima = scanner.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) /2;

        if(quantidadeAtual < quantidadeMedia) {
            System.out.println("Efetuar compra");
        } else{
            System.out.println("Não efetuar a compra");
        }
    }
}
