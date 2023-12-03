import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        float nota1, nota2, nota3, nota4, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Insira a 1º nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Insira a 2º nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Insira a 3º nota: ");
        nota3 = scanner.nextFloat();
        System.out.print("Insira a 4º nota: ");
        nota4 = scanner.nextFloat();

        System.out.println();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);

        if(media >= 5) System.out.println("APROVADO");
        else System.out.println("REPROVADO");
    }
}