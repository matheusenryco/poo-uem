package aula1309;

import java.time.Year;
import java.util.Scanner;

public class DataAniversario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ANO_ATUAL = Year.now().getValue();

        String dataNascimento;
        int dia = 0, mes = 0, ano = 0;

        System.out.println("Data de nascimento: ");
        dataNascimento = scanner.next();

        dia = Integer.parseInt(dataNascimento.substring(0, 2));
        mes = Integer.parseInt(dataNascimento.substring(3, 5));
        ano = Integer.parseInt(dataNascimento.substring(6, 10));

        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (ano <= ANO_ATUAL)) {
            System.out.println("Data válida");
        }
        else {
            System.out.println("Data inválida");
        }

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}