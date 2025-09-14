package aula1309;

import java.util.Scanner;

public class CalculadoraWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte opcao = 1;

        while ((opcao != 0) && (opcao <= 4)) {
            System.out.println("*************************");
            System.out.println("(0) - Sair");
            System.out.println("(1) - Somar");
            System.out.println("(2) - Subtrair");
            System.out.println("(3) - Multiplicar");
            System.out.println("(4) - Dividir");
            System.out.println("*************************");

            System.out.print("O que deseja fazer? ");
            opcao = scanner.nextByte();

            if (opcao == 0) {
                break;
            }

            if (opcao == 1) {
                System.out.println("Digite dois valores para somar");
                System.out.print("Valor 01: ");
                int num01 = scanner.nextInt();
                System.out.print("Valor 02: ");
                int num02 = scanner.nextInt();

                int resultado = num01 + num02;

                System.out.println("Resultado: " + resultado);
            }

            if (opcao == 2) {
                System.out.println("Digite dois valores para subtrair");
                System.out.print("Valor 01: ");
                int num01 = scanner.nextInt();
                System.out.print("Valor 02: ");
                int num02 = scanner.nextInt();

                int resultado = num01 - num02;

                System.out.println("Resultado: " + resultado);
            }

            if (opcao == 3) {
                System.out.println("Digite dois valores para multiplicar");
                System.out.print("Valor 01: ");
                int num01 = scanner.nextInt();
                System.out.print("Valor 02: ");
                int num02 = scanner.nextInt();

                int resultado = num01 * num02;

                System.out.println("Resultado: " + resultado);
            }

            if (opcao == 4) {
                System.out.println("Digite dois valores para dividir");
                System.out.print("Valor 01: ");
                int num01 = scanner.nextInt();
                System.out.print("Valor 02: ");
                int num02 = scanner.nextInt();

                if (num02 == 0) {
                    System.out.println("ERROR: Divisão por zero não é permitida!");
                }
                else {
                    int resultado = num01 / num02;
                    System.out.println("Resultado: " + resultado);
                }
            }
        }
        System.out.println("\nPrograma finalizado");
    }
}