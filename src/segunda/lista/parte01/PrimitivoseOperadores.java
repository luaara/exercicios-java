package segunda.lista.parte01;

import java.util.Scanner;

public class PrimitivoseOperadores {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2 = 10.5;
        char letra = 'A';
        boolean eCaro = true;

        double numero3 = (int) 3.5;

        int dobro = numero1 * 2;
        int triplo = numero1 * 3;
        double metade = (double) numero1 / 2;


        System.out.println("inteiro: " + numero1);
        System.out.println("double: " + numero2);
        System.out.println("caractere: " + letra);
        System.out.println("booleano: " + eCaro);
        System.out.println("double para integer: " + numero3);
        System.out.println("dobro: " + dobro);
        System.out.println("triplo: " + triplo);
        System.out.println("metade: " + metade);

        int numero4 = 25;

        if (numero4 % 2 == 0) {
            System.out.println(numero4 + " é par!");
        } else {
            System.out.println(numero4 + " é ímpar!");
        }

        if (numero4 > 0) {
            System.out.println(numero4 + " é positivo!");
        } else if (numero4 < 0) {
            System.out.println(numero4 + " é negativo!");
        } else {
            System.out.println(numero4 + " é zero!");
        }

        int[] numeros = {10, 5, 8};
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("o maior número do array é: " + maior);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de reais que deseja converter em dólares?");
        double grana = sc.nextDouble();
        double dolar = 5.37;

        double conversao = grana / dolar;
        System.out.printf("Reais: %.2f | Dólares: %.2f", grana, conversao);

        sc.close();

    }
}





