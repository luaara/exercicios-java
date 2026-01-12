/*
Crie uma classe Conta com:

- saldo privado.
- Metodo depositar(double valor) que some ao saldo.
- Metodo getSaldo() para ver o saldo.
- Sem setter — ninguém pode alterar o saldo direto.
 */

package primeira.lista.exercicio05;

public class ContaTeste {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.depositar(100.50);
        System.out.print(conta.getSaldo());



    }




}
