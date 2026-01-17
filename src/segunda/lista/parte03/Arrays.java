package segunda.lista.parte03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            System.out.println(numero);
        }

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int soma = 0;
        int maior = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            int number = sc.nextInt();
            array[i] = number;
            soma += number;
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        for (int numero : array) {
            System.out.println(numero);
        }

        int media = soma / (array.length + 1);
        int cont = 0;
        for (int i = 0; i < 10; i++){
        if (array[i] > media){
            cont++;
            System.out.println("Número maior que a média: " + array[i]);
        }}

        System.out.println("O maior número do array é: " + maior);
        System.out.println("A soma dos 10 números é: " + soma);
        System.out.println("Quantidade de números acima da média: " + cont);

        sc.close();


        int[] numeros2 = {10, 20, 30, 40, 50};
        int[] invertido = new int[numeros2.length];

        for(int i = 0; i < numeros2.length; i++){
            invertido[i] = numeros2[numeros2.length - 1 - i];
        }

        for (int num : invertido){
            System.out.println(num);
        }


        int busca = 20;
        boolean achou = false;
        for (int num : numeros2) {
            if(busca == num){
                achou = true;
            }
        }
        System.out.println(achou ? "Encontrado" : "Não encontrado");

        System.out.println("Números da matriz: ");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma1 += matriz[i][j];
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("Soma: " + soma1);

        System.out.println("Números da matriz: ");
        int soma2 = 0;
        for (int[] linha : matriz) {
            for (int num : linha) {
                soma2 += num;
                System.out.println(num);
            }
        }

        System.out.println("Soma: " + soma2);


    }
}
