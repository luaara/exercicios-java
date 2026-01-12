/*
Crie uma classe Pessoa para incluir:

- Atributo sexo.
- Métodos getSexo() e setSexo(char sexo).
- O setSexo só deve aceitar 'M' ou 'F'. Caso contrário, imprimir "Sexo inválido".
 */


package primeira.lista.exercicio02;

public class PessoaTeste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(12);
        pessoa.setSexo('M');

        if(pessoa.getSexo() == '\u0000'){
            System.out.println("Sexo inválido! Tente M ou F antes de exibir.");
            return;
        }

        System.out.println("===== PESSOA =====");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());

    }

}
