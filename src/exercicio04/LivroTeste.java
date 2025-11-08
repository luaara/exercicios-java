/*
Crie uma classe Livro com dois construtores:

- Um que receba titulo e autor.
- Outro que receba titulo, autor e anoPublicacao.
- Ambos imprimem os dados com um metodo imprime().
 */

package exercicio04;

public class LivroTeste {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Razão e Sensibilidade", "Jane Austen");
        Livro livro2 = new Livro("Razão e Sensibilidade", "Jane Austen", 1992);

        livro1.imprime();
        System.out.println();
        livro2.imprime();


    }

}
