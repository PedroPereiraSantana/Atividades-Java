package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a hora do início da partida");
        int horaInicio = scanner.nextInt();
        System.out.println("Digite a hora do termino da partida");
        int horaTermino = scanner.nextInt();


        int horaTotal = 0;
        if (horaInicio < 24 && horaTermino < 24) {
            if (horaInicio < horaTermino) {
                horaTotal = horaTermino - horaInicio;
            } else {
                horaTotal = 24 - horaInicio + horaTermino;
            }
        } else {
            System.out.println("Hora invalida");
        }

        System.out.printf("A partida durou %d horas", horaTotal);
    }
}
