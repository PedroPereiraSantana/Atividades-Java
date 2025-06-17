package POO;

public class Metodo007 {
    static float calcularSoma(int x, float y){
        return x + y;
    }

    public static void main(String[] args) {
        float calcUm = calcularSoma(2, -1);
        float calcDois = calcularSoma(3, 5.6f);

        System.out.println(calcUm);
        System.out.println(calcDois);
    }
}
