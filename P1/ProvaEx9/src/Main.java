import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String dia, plataforma;
        double custo = 0.0, desconto = 0.0, custoFinal = 0.0;
        String resposta;
        boolean erro;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println();
            System.out.print("Insira o custo: R$");
            custo = scanner.nextInt();

            do {

                System.out.println();
                System.out.print("Insira a plataforma (Primeira letra maiúscula): ");
                plataforma = scanner.next();

                if(plataforma.equals("Playstation") || plataforma.equals("Xbox") || plataforma.equals("Switch")) {

                    erro = false;
                }
                else {

                    System.out.println();
                    System.out.println("Plataforma inválida, tente novamente!");
                    erro = true;
                }
            }
            while(erro == true);

            do {

                System.out.println();
                System.out.print("Insira o dia (Primeira letra maiúscula): ");
                dia = scanner.next();

                if(dia.equals("Segunda") || dia.equals("Terça") || dia.equals("Quarta") || dia.equals("Quinta") || dia.equals("Sexta") || dia.equals("Sábado") || dia.equals("Domingo")) {

                    erro = false;
                }
                else {

                    System.out.println();
                    System.out.println("Dia inválido, tente novamente!");
                    erro = true;
                }
            }
            while(erro == true);

            if(plataforma.equals("Playstation")) {

                if(dia.equals("Segunda")) desconto = custo * 0.05;
                else if(dia.equals("Quinta")) desconto = custo * 0.1;
                else desconto = 0;
            }
            else if(plataforma.equals("Xbox")) {

                if(dia.equals("Terça")) desconto = custo * 0.07;
                else if(dia.equals("Sábado")) desconto = custo * 0.12;
                else desconto = 0;
            }
            else if(plataforma.equals("Switch")) {

                if(dia.equals("Quarta")) desconto = custo * 0.08;
                else if(dia.equals("Domingo")) desconto = custo * 0.06;
                else desconto = 0;
            }

            custoFinal = custo - desconto;

            System.out.println();
            System.out.println("Custo Final: R$" + custoFinal);

            System.out.println();
            System.out.print("Deseja continuar? S - sim: ");
            resposta = scanner.next();
        }
        while(resposta.equals("S") || resposta.equals("s"));
    }
}