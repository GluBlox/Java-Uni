import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            9) A revendedora de carros Pica-Pau Ltda. paga aos seus funcionários vendedores dois salários-mínimos fixos, mais uma comissão fixa de R$ 50,00 por carro vendido e mais 5% do valor das vendas. Faça um programa em Java que determine o salário total de um vendedor.
        */

        double salarioMin, comissao, valorVenda, salarioTotal;
        int quantVenda;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o valor do salário: R$");
        salarioMin = scanner.nextDouble();

        System.out.print("Insira a quantidade de vendas: ");
        quantVenda = scanner.nextInt();

        System.out.print("Insira o valor das vendas: R$");
        valorVenda = scanner.nextDouble();

        comissao = ((quantVenda * 50.0) + (valorVenda * 0.05));

        salarioTotal = (salarioMin * 2) + comissao;

        System.out.println();
        System.out.println("O salário total do vendedor é: R$" + salarioTotal);
    }
}