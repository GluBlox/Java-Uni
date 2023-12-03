import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Insira o primeiro valor: ");
        a = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        b = scanner.nextInt();
        System.out.print("Insira o terceiro valor: ");
        c = scanner.nextInt();

        System.out.println();

        if(a > b && a > c && b > c) System.out.println(a + " " + b + " " + c);
        else if(a > b && a > c && c > b) System.out.println(a + " " + c + " " + b);
        else if(b > a && b > c && a > c) System.out.println(b + " " + a + " " + c);
        else if(b > a && b > c && c > a) System.out.println(b + " " + c + " " + a);
        else if(c > a && c > b && a > b) System.out.println(c + " " + a + " " + b);
        else System.out.println(c + " " + b + " " + a);
    }
}