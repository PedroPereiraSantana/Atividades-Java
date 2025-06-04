package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args){
        Scanner votosScanner = new Scanner(System.in);

        System.out.println("Digite o total de votos nulos");
        int nulos = votosScanner.nextInt();
        System.out.println("Digite o total de votos em Branco");
        int brancos = votosScanner.nextInt();
        System.out.println("Digite o total de votos validos");
        int validos = votosScanner.nextInt();

        int totalVotos = nulos + brancos + validos;

        double porcentagemNulos = (double) nulos / totalVotos * 100;
        double porcentagemBrancos = (double) brancos / totalVotos * 100;
        double porcentagemValidos = (double) validos / totalVotos * 100;

        System.out.println("O total de votos nulos são "+porcentagemNulos);
        System.out.println("O total de votos em branco são "+porcentagemBrancos);
        System.out.println("O total de votos valos são "+ porcentagemValidos );
        votosScanner.close();
    }
}
