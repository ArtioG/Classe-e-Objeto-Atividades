package Ex4Classe.Prateleira;

public class Livro {
    private String nome;
    private double preco;
    private String autor;

    public Livro(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public String toString() {
        return "Livro: " + nome + ", Preco" + preco + ", Autor" + autor;
    }
}
