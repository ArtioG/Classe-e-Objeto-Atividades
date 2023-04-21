package Ex3Classe.Pessoa;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate datadeNascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.datadeNascimento = LocalDate.of(dia, mes, ano);
        this.idade = calculoIdade(LocalDate.now());
    }

    public int calculoIdade(LocalDate dataAtual) {
        return dataAtual.getYear() - datadeNascimento.getDayOfYear();
    }

    public void idade() {
        System.out.println(nome + " tem " + idade + " anos.");
    }

    public String toString() {
        return "Nome: " + nome + ", Data de nascimento" + datadeNascimento;
    }

    public static void main(String[] args) {
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        albertEinstein.idade();
        isaacNewton.idade();
    }
}
