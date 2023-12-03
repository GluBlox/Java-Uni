import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int produtoImpar = 1, somaPar = 0, numero;

        while (true) {
            System.out.print("Informe um número inteiro positivo (ou 0 para encerrar): ");
            numero = exe.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPar += numero;
            } else {
                produtoImpar *= numero;
            }
        }

        System.out.println("Produto dos números ímpares: " + produtoImpar);
        System.out.println("Soma dos números pares: " + somaPar);
    }
}
