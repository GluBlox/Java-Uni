import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
            13) Faça um programa em Java que leia 3 números inteiros distintos e escreva o menor deles.
        */

        int a = 0, b = 0, c = 0;

        Scanner scanner = new Scanner(System.in);

        //Code

        for(int i = 0; i < 1; i++) {

            System.out.println();
            System.out.print("Insira o valor de A: ");
            a = scanner.nextInt();

            System.out.println();
            System.out.print("Insira o valor de B: ");
            b = scanner.nextInt();

            System.out.println();
            System.out.print("Insira o valor de C: ");
            c = scanner.nextInt();

            if(a == b || a == c || b == c){

                System.out.println();
                System.out.println("Os números devem ser diferentes, escreva novamente!");
                i--;
            }
        }

        System.out.println();

        if(a < b && a < c) System.out.println("A: " + a);
        else if(b < a && b < c) System.out.println("B: " + b);
        else if(c < a && c < b) System.out.println("C: " + c);
    }
}