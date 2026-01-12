/*
Crie uma classe Carro com os atributos:

- marca
- ano

Implemente getters e setters para ambos os atributos.

No metodo setAno, não permita anos menores que 1886 (primeiro carro criado).

Depois, teste a classe em CarroTest.
*/

package exercicio01;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setAno(1996);
        carro1.setMarca("Jeep");

        if(carro1.getAno() == 0){
            System.out.println("Não existem carros com esse ano! Corrija antes de exibir.");
            return;
        }

        System.out.println("===== CARRO =====");
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Marca: " + carro1.getMarca());

    }


}
