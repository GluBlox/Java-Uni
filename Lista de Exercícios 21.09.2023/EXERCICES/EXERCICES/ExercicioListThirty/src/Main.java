import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int totalNumeros = 20, somaPositivos = 0, totalNegativos = 0;
        int numero;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Informe o número #" + i + ": ");
            numero = exe.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                totalNegativos++;
            }
        }

        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Total de números negativos: " + totalNegativos);

    }
}
