package aula1309;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = scanner.nextInt();

        int i;

        for (i = 0; i < valor; i += 2) {
            System.out.println(i);
        }
    }
}
