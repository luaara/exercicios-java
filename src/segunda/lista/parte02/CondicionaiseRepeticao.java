package segunda.lista.parte02;

public class CondicionaiseRepeticao {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int i = 0;
        while(i <= 50){
            for(i = 0; i <= 50; i+=2){
                System.out.println(i);
            }
        }

        int soma = 0;
        for(int j = 1; j <= 100; j++){
            soma += j;
        }
        System.out.println(soma);

    }

}
