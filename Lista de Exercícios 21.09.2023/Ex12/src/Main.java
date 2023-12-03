import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
            12) Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
            serviços é de:
                • R$ 5.50 por diária, se o número de diárias for maior que 15;
                • R$ 6.00 por diária, se o número de diárias for igual a 15;
                • R$ 8.00 por diária, se o número de diárias for menor que 15.
            Construa um programa em Java que mostre o nome e o total da conta de um
            cliente.
        */

        String nome;
        int quantDiaria;
        double conta;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o nome: ");
        nome = scanner.next();

        System.out.println();
        System.out.print("Insira a quantidade de dias: ");
        quantDiaria = scanner.nextInt();

        if(quantDiaria > 15) conta = 60 + (5.50 * quantDiaria);
        else if(quantDiaria == 15) conta = 60 + (6 * quantDiaria);
        else conta = 60 + (8 * quantDiaria);

        System.out.println();
        System.out.println("Nome: " + nome + "\nConta: R$" + conta);
    }
}