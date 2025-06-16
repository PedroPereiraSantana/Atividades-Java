package exemplos;

public class Classes004 {
    String dono; // o this referencia essa variavel
    String modelo;
    int ano;

    public Classes004 (String dono, String modelo, int ano){
        this.dono = dono;
        this.modelo = modelo;
        this.ano = ano;
    }

    public static void main(String[] args) {
        Classes004 carro1 = new Classes004("Maneiro", "CarroManeiro", 2023);
        Classes004 carro4 = new Classes004("FessorJaison", "CarroDoJaison", 2023);
    }
}
