import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
            11) Escreva um programa em Java que, para uma conta bancária, leia o seu
            número, o saldo, o tipo de operação a ser realizada (depósito ou retirada)
            e o valor da operação. Após, determine e mostre o novo saldo. Se o novo
            saldo ficar negativo, deve ser mostrada, também, a mensagem “conta
            estourada”.
        */

        int codigo, resposta;
        double saldo, valorOp, novoSaldo = 0.0;

        Scanner scanner = new Scanner(System.in);

        //Code

        System.out.println();
        System.out.print("Insira o código de acesso: ");
        codigo = scanner.nextInt();

        System.out.println();
        System.out.print("Insira o saldo da conta: R$");
        saldo = scanner.nextDouble();

        for(int i = 0; i < 1; i++){

            System.out.println();
            System.out.print("Entre com o tipo de operação (1 - Depósito | 2 - Retirada): ");
            resposta = scanner.nextInt();

            switch(resposta){

                case 1:{

                    System.out.println();
                    System.out.print("Insira o valor a ser depositado: R$");
                    valorOp = scanner.nextDouble();

                    novoSaldo = saldo + valorOp;

                    System.out.println();

                    break;
                }

                case 2:{

                    System.out.println();
                    System.out.print("Insira o valor a ser retirado: R$");
                    valorOp = scanner.nextDouble();

                    novoSaldo = saldo - valorOp;

                    System.out.println();

                    break;
                }

                default:{

                    System.out.println("Operação inexistente, tente novamente!");
                    i--;

                    break;
                }
            }
        }

        System.out.println();

        System.out.println("Novo Saldo = R$" + novoSaldo);

        if(novoSaldo < 0) System.out.println("Conta Estourada!");
    }
}