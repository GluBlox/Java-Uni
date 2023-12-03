import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args) {
        /*
            5) Criar um programa em Java para classificar candidatos a um vestibular. Os candidatos deverão passar pôr prova teórica e prática. O candidato que obtiver nota superior a 9 na prova teórica e nota superior a 9 na prática será aprovado. Caso o candidato consiga tirar nota superior a 8 na nota teórica e superior a 9 na prova teórica, deverá ser analisado suas informações escolares, ou seja, se o candidato estudou em escola pública, a nota teórica será acrescida de 1,5 ponto. Mostrar as notas teóricas e prática e o resultado do candidato (aprovado ou reprovado). Sabe-se que ao todo eram 35 candidatos.
        */

        double notaTeo, notaPra;
        int resposta;

        Scanner scanner = new Scanner(System.in);

        //Code

        for (int i = 0; i < 35; i++)
        {
            System.out.println();
            System.out.print("Insira a nota teórica: ");
            notaTeo = scanner.nextDouble();
            System.out.print("Insira a nota prática: ");
            notaPra = scanner.nextDouble();

            System.out.println();

            if (notaTeo >= 9.0 && notaPra >= 9.0) System.out.println("Nota teórica: " + notaTeo + "\nNota prática: " + notaPra + "\nAprovado!");
            else if (notaTeo >= 8.0 && notaPra >= 9.0)
            {
                System.out.println("Estudou em escola pública? 1 - Sim | 2 - Não");
                resposta = scanner.nextInt();

                System.out.println();

                for (int x = 0; x < 1; x++)
                {
                    switch (resposta)
                    {
                        case 1:
                        {
                            notaTeo = notaTeo + 1.5;
                            System.out.println("Nota teórica: " + notaTeo + "\nNota prática: " + notaPra + "\nAprovado!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Nota teórica: " + notaTeo + "\nNota prática: " + notaPra + "\nReprovado!");
                            break;
                        }
                        default:
                        {
                            System.out.println("Resposta inválida, responda novamente!");
                            i--;
                            break;
                        }
                    }
                }
            }
            else System.out.println("Nota teórica: " + notaTeo + "\nNota prática: " + notaPra + "\nReprovado!");
        }
    }
}