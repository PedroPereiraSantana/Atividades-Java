package POO;

public class Metodo004 {

    static void dadosProfessos(String primeiroNome, int idade){
        System.out.println("Professor/a "+ primeiroNome + " tem "+ idade + " anos de idade");
    }

    public static void main(String[] args){
        dadosProfessos("Jaison", 40);
        dadosProfessos("Júlio", 51);
        dadosProfessos("Aurora", 35);
    }
}
