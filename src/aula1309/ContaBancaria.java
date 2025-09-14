package aula1309;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcao = "";
        double saldo = 0;

        do {
            System.out.println("*************************");
            System.out.println("(A) - Consultar saldo");
            System.out.println("(B) - Saque");
            System.out.println("(C) - Depósito");
            System.out.println("(D) - Sair");
            System.out.println("*************************");

            System.out.print("O que deseja fazer? ");
            opcao = scanner.next();

            if (opcao.equalsIgnoreCase("A")) {
                System.out.printf("Saldo: %.2f\n", saldo);
            }

            if (opcao.equalsIgnoreCase("B")) {
                System.out.println("Quanto deseja sacar? ");
                double saque = scanner.nextDouble();

                if (saque > saldo) {
                    System.out.println("Saldo indisponível");
                }
                else {
                    System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", saque);
                    saldo -= saque;
                }
            }

            if (opcao.equalsIgnoreCase("C")) {
                System.out.println("Quanto deseja depositar? ");
                double deposito = scanner.nextDouble();
                saldo += deposito;

                System.out.printf("Depósito de R$ %.2f realizado com sucesso\n", deposito);
            }

            if (opcao.equalsIgnoreCase("D")) {
                break;
            }
        } while (opcao != "D");
    }
}