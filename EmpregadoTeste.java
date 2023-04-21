package Ex2Classe.EmpregadoTeste;

import Ex2Classe.Empregado.Empregado;

public class EmpregadoTeste {
        public static void main(String[] args) {
                Empregado empregado1 = new Empregado("Jose", "Aldo", 1200.00);
                Empregado empregado2 = new Empregado("Lucas", "Farias", 1500.00);

                System.out.println("Salario Anual do Empregado 1: " + "" + empregado1.getNome() + ""
                                + empregado1.getSobrenome()
                                + ":" + empregado1.getsalarioAnual());
                System.out.println("Salario Anual do Empregado 2: " + "" + empregado2.getNome() + ""
                                + empregado2.getSobrenome()
                                + ":" + empregado2.getsalarioAnual());

                empregado1.Salarioaumento(10);
                empregado2.Salarioaumento(10);

                System.out.println("Novo salario Anual do Empregado 1: " + " " + empregado1.getNome() + " "
                                + empregado1.getSobrenome() + ": " + empregado1.getsalarioAnual());
                System.out.println("Novo salario Anual do Empregado 2: " + " " + empregado2.getNome() + " "
                                + empregado2.getSobrenome() + ": " + empregado2.getsalarioAnual());

        }
}
