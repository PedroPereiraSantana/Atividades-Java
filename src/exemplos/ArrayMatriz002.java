package exemplos;

/*
* esse código está passando em cada linha, quando está dentro daquela linha ele entra em outro laço que seria todas as colunas daquela linha
* e ao passar por todas as colunas ele vai para a próxima linha e faz a mesma coisa até que passe por todas as linhas.
* */

public class ArrayMatriz002 {
    public static void main(String[] args) {
        int [][] numeros = {{1, 2, 3, 4, 5,}, {6, 7, 8}, {3, 5, 6, 7}, {3, 5, 2, 5, 6}};

        for (int i = 0; i < numeros.length; ++i){
            System.out.println("está na linha " + i);
            for (int cont = 0; cont < numeros[i].length; ++cont){
                System.out.println(i+" "+numeros[i][cont]);
            }
        }

    }

}
