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
        System.out.print("Insira o valor de A: ");
        a = scanner.nextInt();
        System.out.print("Insira o valor de B: ");
        b = scanner.nextInt();

        if(a > b) c = a - b;
        else if(a < b) c = b - a;
        else c = a - b;

        System.out.println("A diferença entre A e B é " + c);
    }
}