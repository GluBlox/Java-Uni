import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            2) Faça um programa em Java que leia o nome do produto, quantidade e quantidade mínima em estoque. Caso a quantidade em estoque seja menor que a quantidade mínima emitir uma mensagem dizendo que o produto deve ser comprado. Caso contrário emitir uma mensagem dizendo a quantidade em estoque. O algoritmo deve ser repetido enquanto o usuário informar que há mais produtos.
        */

        String produto, resposta;
        int quant, quantMinima;

        Scanner scanner = new Scanner(System.in);

        //Code

        do
        {
            System.out.println();
            System.out.print("Insira um produto: ");
            produto = scanner.next();

            System.out.print("Insira a quantidade do produto: ");
            quant = scanner.nextInt();

            System.out.print("Insira a quantidade mínima: ");
            quantMinima = scanner.nextInt();

            if(quant < quantMinima) System.out.println("Produto em falta!");
            else System.out.println("Quantidade em estoque: " + quant);

            System.out.println("Deseja continuar? S - Sim");
            resposta = scanner.next();
        }
        while(resposta.equals("s") || resposta.equals("S"));
    }
}