import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos números serão usados no vetor");
        numeros = s.nextInt();
        int valor[] = new int[numeros];
        int diferenca =Integer.MIN_VALUE;
        for (int i=0; i<valor.length; i++) {
            System.out.println("Digite um valor");
            valor[i] = s.nextInt();
        }
        for (int i=1; i<valor.length; i++) {
            if (valor[i-1] - valor[i] > diferenca) {
                diferenca = valor[i - 1] - valor[i];
            }
            if (valor[i] - valor[i - 1] > diferenca) {
                diferenca = valor[i] - valor[i - 1];
            }
        }
        System.out.println("A maior diferença é de " +diferenca);
    }

}