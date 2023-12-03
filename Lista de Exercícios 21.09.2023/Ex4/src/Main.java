import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            4) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
        */

        int quantMaca;
        double custo;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira a quantidade: ");
        quantMaca = scanner.nextInt();

        System.out.println();

        if(quantMaca < 12) custo = quantMaca * 1.30;
        else custo = quantMaca * 1.00;

        System.out.println("Custo = R$" + custo);
    }
}