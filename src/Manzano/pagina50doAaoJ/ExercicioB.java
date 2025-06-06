package Manzano.pagina50doAaoJ;

public class ExercicioB {
    public static void main(String[] args) {
        int cont = 1;
        int soma = 0;

        do{
            if(cont % 2 == 0 ){
                soma = soma + cont;
            }

            System.out.println("O contador está em "+ cont);
            cont ++;
        } while(cont < 501);

        System.out.println("A soma total dos valores pares é "+ soma);
    }
}
