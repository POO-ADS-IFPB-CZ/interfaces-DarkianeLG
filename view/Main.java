package view;

import model.Triatleta;
import model.questao2.ContaPoupanca;

public class Main {
    public static void main(String[] args){

        Triatleta triatleta = new Triatleta("João", "Cajazeiras");

        System.out.println("\n----QUESTÃO 1----\n");

        System.out.println("Triatleta: " + triatleta.getNome());
        triatleta.nada();
        triatleta.corre();
        triatleta.pedala();

        System.out.println("\n----QUESTÃO 2----\n");

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, "Carlos", 1000.0);

        // Exibindo informações da conta
        System.out.println("Número da conta: " + contaPoupanca.getNumero());
        System.out.println("Titular: " + contaPoupanca.getNome());
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        // Reajustando o saldo com uma taxa de 5%
        contaPoupanca.reajustar(5.0);
        System.out.println("Saldo após reajuste: " + contaPoupanca.getSaldo());

        // Adicionando um depósito e exibindo novamente
        contaPoupanca.depositar(200.0);
        System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());

    }
}
