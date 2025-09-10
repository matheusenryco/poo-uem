package aula0809.cenario01.application;

import java.util.Scanner;
import aula0809.cenario01.entities.Conta;

public class ProgramConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();


        conta.setNomeTitular("Matheus Enryco");
        conta.setNumConta(201050);
        conta.setSaldo(10.00);

        System.out.println("Nome do titular: " + conta.getNomeTitular());
        System.out.println("Número de conta: " + conta.getNumConta());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(100.00);

        System.out.println("\nSaldo disponível na conta: " + conta.getSaldo());

        conta.sacar(2);
        System.out.println("Saldo: " + conta.getSaldo());

        input.close();
    }
}
