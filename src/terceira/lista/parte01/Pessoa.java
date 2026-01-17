package terceira.lista.parte01;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

   public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa (String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void saudar();
}
