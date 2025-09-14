package aula0509;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        Pessoa pessoa = new Pessoa("Matheus", 19, "teste@teste.com");

        System.out.print("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nEmail: " + pessoa.getEmail());
    }
}
