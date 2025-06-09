package exemplos;

//*
//é um calculo de média de idade, onde tem um array que
// armazena todas as idade, uma varivel que soma, e a variavel
//media que armazena o valor total dividido pelo tamanho o array
// usando o nome do array .length
// *//

public class Array005 {
    public static void main(String[] args){
        int[] idade = {40, 89, 37, 35, 45};
        int soma = 0;

        for (int i: idade){
            soma += i;
        }

        int media = soma / idade.length;

        System.out.printf("A média de idade é %d ",media);
    }
}
