package Ex4Classe.Prateleira;

public class Album {
    private String nome;
    private double preco;
    private int numFaixas;

    public Album(String nome, double preco, int numFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numFaixas = numFaixas;
    }

    public String toString() {
        return "CD: " + nome + ", Preço: " + preco + ", Número de Faixas: " + numFaixas;
    }
}
