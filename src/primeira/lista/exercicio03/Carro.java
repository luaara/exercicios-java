package primeira.lista.exercicio03;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirDados(){
        System.out.printf("Esse carro é da marca %s, modelo %s e ano %d", marca, modelo, ano);
    }

}
