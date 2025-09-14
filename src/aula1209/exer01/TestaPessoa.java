package aula1209.exer01;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Matheus Enryco");
        pessoa.setIdade(19);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}
