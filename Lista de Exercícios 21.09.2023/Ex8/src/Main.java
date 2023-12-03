import java.sql.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            8) Uma empresa de vendas tem três corretores. A empresa paga ao corretor uma comissão calculada de acordo com o valor de suas vendas. Se o valor da venda de um corretor for maior que R$ 50.000.00 a comissão será de 12% do valor vendido. Se o valor da venda do corretor estiver entre R$ 30.000.00 e R$ 50.000.00 (incluindo extremos) a comissão será de 9.5%. Em qualquer outro caso, a comissão será de 7%. Escreva um programa em Java que gere um relatório contendo nome, valor da venda e comissão de cada um dos corretores. O relatório deve mostrar também o total de vendas da empresa.
        */

        String[] nome = new String[3];
        double[] valorVenda = new double[3];
        double[] comissaoVenda = new double[3];

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Insira o nome do vendedor: ");
            nome[i] = scanner.next();
            System.out.print("Insira o valor da venda do vendedor " + (i + 1) + ": ");
            valorVenda[i] = scanner.nextDouble();

            System.out.println();

            if(valorVenda[i] > 50000.00) comissaoVenda[i] = valorVenda[i] * 0.12;
            else if(valorVenda[i] < 50000.00 && valorVenda[i] > 30000.00) comissaoVenda[i] = valorVenda[i] * 0.095;
            else comissaoVenda[i] = valorVenda[i] * 0.07;
        }

        System.out.println();

        for(int x = 0; x < 3; x++)
        {
            System.out.println("Vendedor " + (x + 1));
            System.out.println("Nome: " + nome[x]);
            System.out.println("Valor da venda: R$" + valorVenda[x]);
            System.out.println("Comissão: R$" + comissaoVenda[x]);

            System.out.println();
        }
    }
}