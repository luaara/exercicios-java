package terceira.lista.parte01;

public class Professor extends Pessoa implements Avaliavel {
     private String disciplina;

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public Professor(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public Professor(String nome, String sobrenome, int idade, String disciplina) {
        super(nome, sobrenome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void saudar() {
        System.out.println("Oi, turma!");
    }

    @Override
    public void avaliar() {
        System.out.println("Avaliando os alunos!");
    }
}
