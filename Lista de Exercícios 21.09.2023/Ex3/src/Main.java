import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        /*
            3) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
        */

        int num;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira um número: ");
        num = scanner.nextInt();

        System.out.println();

        if(num >= 0) System.out.println("O número é positivo");
        else System.out.println("O número é negativo");
    }
}