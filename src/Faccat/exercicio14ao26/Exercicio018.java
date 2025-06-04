package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio018 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        int anoAtual = scanner.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        String resposta = idade > 15 ? "Esse ano você pode votar" : "Esse ano você não podera votar";

        System.out.println(resposta);
    }
}
