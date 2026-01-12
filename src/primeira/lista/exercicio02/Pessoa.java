package primeira.lista.exercicio02;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

//    public void setSexo(char sexo) {
//        sexo = Character.toUpperCase(sexo);
//        if (sexo != 'M' && sexo != 'F') {
//        System.out.println("Caractere inválido! Tente M ou F.");
//        return;
//    } this.sexo =sexo;
//}

    public void setSexo(char sexo) {
        sexo = Character.toUpperCase(sexo);
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
    }

}
