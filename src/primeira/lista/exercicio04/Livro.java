package primeira.lista.exercicio04;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this(titulo, autor);
        this.anoPublicacao = anoPublicacao;
    }

    public void imprime() {
        System.out.println("=== LIVRO ===");
        System.out.println("Título" + titulo);
        System.out.println("Autor" + autor);

        if (anoPublicacao != 0) {
            System.out.println("Ano de publicação: " + anoPublicacao);
        }

    }


}
