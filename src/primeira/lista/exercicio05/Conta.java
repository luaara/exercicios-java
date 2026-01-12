package primeira.lista.exercicio05;

public class Conta {
    private double saldo;


    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return;
        }
        System.out.println("Valor inválido!");
    }

    public double getSaldo() {
        return this.saldo;
    }
}
