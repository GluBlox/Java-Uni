import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        int a, b, c, d;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Insira o primeiro valor: ");
        a = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        b = scanner.nextInt();
        System.out.print("Insira o terceiro valor: ");
        c = scanner.nextInt();
        System.out.print("Insira o quarto valor: ");
        d = scanner.nextInt();

        System.out.println();

        if(a % 2 == 0 && a % 3 == 0) System.out.println(a);
        if(b % 2 == 0 && b % 3 == 0) System.out.println(b);
        if(c % 2 == 0 && c % 3 == 0) System.out.println(c);
        if(d % 2 == 0 && d % 3 == 0) System.out.println(d);
    }
}