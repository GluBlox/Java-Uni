import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
            15) Faça um programa em Java que leia quatro números (Opção, Num1,
            Num2 e Num3) e mostre o valor de Num1 se Opção for igual a 2; o valor
            de Num2 se Opção for igual a 3; e o valor de Num3 se Opção for igual a
            4. Os únicos valores possíveis para a variável Opção são 2, 3 e 4.
        */

        int num1 = 0, num2 = 0, num3 = 0, opcao = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 1; i++){

            System.out.println();
            System.out.print("Insira a opção: ");
            opcao = scanner.nextInt();

            if(opcao < 2 || opcao > 4){

                System.out.println();
                System.out.println("Opção inválida, tente novamente!");
                i--;
            }
        }

        System.out.println();
        System.out.print("Insira o primeiro valor: ");
        num1 = scanner.nextInt();

        System.out.println();
        System.out.print("Insira o segundo valor: ");
        num2 = scanner.nextInt();

        System.out.println();
        System.out.print("Insira o terceiro valor: ");
        num3 = scanner.nextInt();

        System.out.println();

        switch(opcao){

            case 2: System.out.println("Num1 = " + num1); break;
            case 3: System.out.println("Num2 = " + num2); break;
            case 4: System.out.println("Num3 = " + num3); break;
        }
    }
}