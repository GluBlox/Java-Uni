import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
            14) Suponha que o conceito de um aluno seja determinado em função da sua
            nota. Suponha, também, que esta nota seja um valor inteiro na faixa de 0
            a 100, conforme a seguinte faixa:
                • Nota Conceito
                • 0 a 49 Insuficiente
                • 50 a 64 Regular
                • 65 a 84 Bom
                • 85 a 100 Ótimo
            Crie um programa em Java que apresente o conceito e a nota do aluno.
        */

        int nota = 0;

        Scanner scanner = new Scanner(System.in);

        //Code

        for(int i = 0; i < 1; i++) {

            System.out.println();
            System.out.print("Insira a nota: ");
            nota = scanner.nextInt();

            System.out.println();

            if (nota >= 0 && nota <= 49) System.out.println("Nota: " + nota + "\nInsuficiente");
            else if (nota >= 50 && nota <= 64) System.out.println("Nota: " + nota + "\nRegular");
            else if (nota >= 65 && nota <= 84) System.out.println("Nota: " + nota + "\nBom");
            else if (nota >= 85 && nota <= 100) System.out.println("Nota: " + nota + "\nÓtimo");
            else {

                System.out.println("Valor inválido, insira nova nota!");
                i--;
            }
        }
    }
}