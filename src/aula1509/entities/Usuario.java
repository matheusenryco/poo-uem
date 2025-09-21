package aula1509.entities;

public class Usuario {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private Livro livro;

    public Usuario(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void lerLivro() {
        System.out.println("Você está lendo o livro");
    }

    public void mostrarDadosUsuario() {
        System.out.println("\n=================DADOS DO USUÁRIO=================");
        System.out.println("Nome: " + getNome()
                            + "\nIdade: " + getIdade()
                            + "\nSexo: " + getSexo()
                            + "\nTelefone: " + getTelefone());
    }
}
