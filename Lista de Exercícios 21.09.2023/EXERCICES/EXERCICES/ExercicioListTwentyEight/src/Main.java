import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int numero, contador = 0;

        while (true) {
            System.out.print("Informe um número (ou 0 para encerrar): ");
            numero = exe.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 100 e 200: " + contador);
    }
}
