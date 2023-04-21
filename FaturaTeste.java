package ExClasse.FaturaTeste;

import ExClasse.Fatura.Fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("123", "Teclado", 5, 300.00);
        System.out.println("Fatura 1: ");
        System.out.println("Numero: " + fatura1.getNumero());
        System.out.println("Descricao: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preco: " + fatura1.getPreco());

        Fatura fatura2 = new Fatura("111", "Monitor", 3, 3500.90);
        System.out.println("Fatura 2: ");
        System.out.println("Numero: " + fatura2.getNumero());
        System.out.println("Descricao: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preco: " + fatura2.getPreco());

        Fatura fatura3 = new Fatura("333", "Mouse", 2, -20.90);
        System.out.println("Fatura 3: ");
        System.out.println("Numero: " + fatura3.getNumero());
        System.out.println("Descricao: " + fatura3.getDescricao());
        System.out.println("Quantidade: " + fatura3.getQuantidade());
        System.out.println("Preco: " + fatura3.getPreco());
    }
}