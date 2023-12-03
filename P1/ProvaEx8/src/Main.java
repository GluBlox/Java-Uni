import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int hora = 0;
        String resposta = "S";

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println();
            System.out.print("Insira a quantidade de horas de sono: ");
            hora = scanner.nextInt();

            if(hora >= 0 && hora <= 3) System.out.println(hora + " horas de sono = Insônia");
            else if(hora > 3 && hora <= 5) System.out.println(hora + " horas de sono = Pouco descanso");
            else if(hora > 5 && hora <= 7) System.out.println(hora + " horas de sono = Descanso adequado");
            else if(hora > 7 && hora <= 9) System.out.println(hora + " horas de sono = Descanso ideal");
            else if(hora > 9) System.out.println(hora + " horas de sono = Muito descanso");
            else System.out.println("Valor inválido!");

            System.out.println();
            System.out.print("Deseja continuar? S - sim: ");
            resposta = scanner.next();
        }
        while(resposta.equals("S") || resposta.equals("s"));
    }
}