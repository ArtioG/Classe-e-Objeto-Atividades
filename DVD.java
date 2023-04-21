package Ex4Classe.Prateleira;

public class DVD {
    private String nome;
    private double preco;
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String toString() {
        return "DVD: " + nome + ", Preço: " + preco + ", Duração: " + duracao + " minutos";
    }

}
