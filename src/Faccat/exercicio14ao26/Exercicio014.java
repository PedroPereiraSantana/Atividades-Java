package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();
        String resposta = "";

        resposta = valor < 10 ? "É menor que 10" :
                valor == 10 ? "O valor é igual a 10" : "O valor é maior que 10";

        /*
        if(valor < 10) {
            resposta = "É menor que 10";
        } else if (valor == 10) {
            resposta = "É igual a 10";
        } else {
            resposta = "É maior que 10";
        }
        */
        System.out.println(resposta);
    }
}
