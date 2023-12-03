import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            6) Faça um programa em Java que leia dois números A e B e imprima o maior deles.
        */

        int a, b;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o valor de A: ");
        a = scanner.nextInt();
        System.out.print("Insira o valor de B: ");
        b = scanner.nextInt();

        if(a > b) System.out.println("A é maior que B" + "\nA = " + a);
        else if(a < b) System.out.println("B é maior que A" + "\nB = " + b);
        else System.out.println("B e A são iguais" + "\nA = " + a + "\nB = " + b);
    }
}