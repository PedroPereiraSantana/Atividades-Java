package Arrays;

public class ArrayMatriz003 {
    public static void main(String[] args) {
        int [][] numeros = {{1, 2, 3, 4}, {5, 6, 7}};

        for (int [] linha : numeros){
            for (int i : linha){
                System.out.println(i);
            }
        }
    }
}
