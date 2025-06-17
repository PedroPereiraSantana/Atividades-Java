package POO;

public class Metodo009 {


    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k){
        if(k > 0) {
            return k + sum(k - 1); // esse sum() está chamando a função denovo e denovo até que seja menor que 0
        } else {
            return 0;
        }
    }
}
