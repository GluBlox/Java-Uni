import java.io.Console;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            1) Criar um programa em Java que solicite o salário de um funcionário e calcule o INSS (11%) e o valor de contribuição sindical, considerando a tabela abaixo. Mostrar no final do algoritmo o salário bruto, salário líquido, valor pago de inss e valor pago de contribuição sindical.

                salário < 800 = 2% de contribuição sindical

                salário >= 800 e <= 1500 3% de contribuição sindical

                salário > 1500 5% de contribuição sindical
        */

        double salarioBruto, salarioLiquido, inss, contribuSind;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o salário: ");
        salarioBruto = scanner.nextDouble();

        inss = salarioBruto * 0.11;

        if(salarioBruto < 800.00) contribuSind = salarioBruto * 0.02;
        else if(salarioBruto >= 800.00 && salarioBruto <= 1500.00) contribuSind = salarioBruto * 0.03;
        else contribuSind = salarioBruto * 0.05;

        salarioLiquido = salarioBruto - (inss + contribuSind);

        System.out.println();
        System.out.println("O salário bruto é R$" + salarioBruto);
        System.out.println("O salário líquido é R$" + salarioLiquido);
        System.out.println("O valor do INSS é R$" + inss);
        System.out.println("O valor da contribuição sindical é R$" + contribuSind);
    }
}