import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = exe.nextInt();

        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";

        String positivoOuNegativo = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero";

        System.out.println("O número informado é " + parOuImpar + " e " + positivoOuNegativo + ".");

    }
}
