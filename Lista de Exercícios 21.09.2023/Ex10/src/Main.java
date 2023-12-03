import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            10) Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé do tipo 1 é vendido por R$ 0.50, o do tipo 2 por R$ 0.60 e o do tipo 3 por R$ 0.75. Faça um programa em Java que, para cada tipo de picolé, mostre a quantidade vendida e o total arrecadado.
        */

        double[] valorPicole = new double[3];
        int[] quantPicole = new int[3];

        Scanner scanner = new Scanner(System.in);

        //Code

        for(int i = 0; i < 3; i++)
        {
            System.out.println();
            System.out.print("Insira a quantidade de tipo " + (i + 1) + " vendidos: ");
            quantPicole[i] = scanner.nextInt();

            switch(i)
            {
                case 0:
                {
                    valorPicole[i] = quantPicole[i] * 0.50;
                    break;
                }
                case 1:
                {
                    valorPicole[i] = quantPicole[i] * 0.60;
                    break;
                }
                case 2:
                {
                    valorPicole[i] = quantPicole[i] * 0.75;
                    break;
                }
            }
        }

        System.out.println();

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Picolé Tipo " + (i + 1));
            System.out.println("Quantidade: " + quantPicole[i]);
            System.out.println("Valor Total: " + valorPicole[i]);
            System.out.println();
        }
    }
}