package Arrays;

//*
// esse código está pegando um array de idade que está com um laço de repetição para pegar o menor numero do array, com um if ternario ele checka se o numero
// naquele momento é menor que o ultimo numero que já estava lá, e vai reatribuindo caso o numero seja menor e continua o numero que já estava caso for maior que
// o número que já estava lá.
// *//


public class Array006_2 {
    public static void main(String[] args) {
        int[] idades = {40, 98, 35, 20, 27, 42};
        int menorIdade = idades[0];

        for (int idade: idades) {
            menorIdade = (idade < menorIdade) ? idade : menorIdade;
        }

        System.out.println(menorIdade);

    }
}
