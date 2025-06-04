package Faccat.exercicio3ao11;
import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args){
        Scanner antecessorScanner = new Scanner(System.in);

        System.out.println("Número antecessor");

        System.out.println("Digite um número");
        int numero = antecessorScanner.nextInt();

        int antecessor = numero - 1;

        System.out.println("O antecessor do número digitado foi "+ antecessor);
        antecessorScanner.close();
    }
}
