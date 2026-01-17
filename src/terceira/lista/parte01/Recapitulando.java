package terceira.lista.parte01;

import java.util.Scanner;

public class Recapitulando {
    public static void main(String[] args) {
        // Fundamentos
        int quantidade = 10;
        double media = 50.5;
        char letra = 'A';
        char numero = '5';
        boolean eVerdadeiro = true;

        System.out.println("Tipo inteiro: " + quantidade);
        System.out.println("Tipo double: " + media);
        System.out.println("Tipo char: " + letra);
        System.out.println("Tipo char: " + numero);
        System.out.println("Tipo booleano: " + eVerdadeiro);

        System.out.println("----- verificador de idade -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String eMaior = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(eMaior);

        if (idade < 18) {
            System.out.println("Você é menor de idade!");
        } else {
            System.out.println("Você é maior de idade!");
        }

        sc.close();

        System.out.println("----- números de 1 a 10 -----");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("----- lista de números -----");
        int[] lista = {1, 2, 3, 4, 5};
        for (int n : lista) {
            System.out.println(n);
        }

        // Condicionais e Loops

        System.out.println("----- dia da semana -----");
        int qDia = 2;
        String dia = switch (qDia) {

            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Busca inválida!";

        };
        System.out.println("Hoje é: " + dia);

        System.out.println("----- loop -----");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // Arrays
        System.out.println("----- criando array -----");
        int[] meuArray = new int[5];
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 5;

        for (int n : meuArray) {
            System.out.println(n);
        }

        System.out.println("----- lendo matriz -----");
        int[][] novoArray = {{1, 2}, {3, 4}};
        for (int k = 0; k < novoArray.length; k++) {
            for (int l = 0; l < novoArray.length; l++) {
                System.out.println(novoArray[k][l]);
            }
        }


    }


}
