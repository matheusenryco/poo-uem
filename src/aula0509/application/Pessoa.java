package aula0509.application;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String n, int id, String em) {
        nome = n;
        idade = id;
        email = em;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}