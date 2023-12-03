import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            7) Faça um programa em Java que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:
            • “F1”, se N <= 10
            • “F2”, se N > 10 e N <= 100
            • “F3”, se n > 100
        */

        int num;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o valor: ");
        num = scanner.nextInt();

        if(num <= 10) System.out.println("F1");
        else if(num > 10 && num <= 100) System.out.println("F2");
        else System.out.println("F3");
    }
}