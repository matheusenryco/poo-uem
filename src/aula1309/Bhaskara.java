package aula1309;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 4;
        double b = 3;
        double c = 2;

        if (a == 0) {
            System.out.println("Error, 'a' não pode ser zero");
        }
        else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Error, delta não pode ser negativo");
            }
            else {
                System.out.println("O valor de delta é: " + delta);
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("o valor de x1 é: %.5f\n", x1);
                System.out.printf("o valor de x2 é: %.5f\n", x2);
            }
        }
    }
}
