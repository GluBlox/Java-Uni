import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        double saldoMedio, valorCredito;

        System.out.println("Informe o saldo médio do cliente: ");
        saldoMedio = exe.nextDouble();

        if (saldoMedio >= 0 && saldoMedio <= 200) {
            valorCredito = 0;
        } else if (saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.20;
        } else if (saldoMedio <= 600) {
            valorCredito = saldoMedio * 0.30;
        } else {
            valorCredito = saldoMedio * 0.40;
        }

        System.out.println("Saldo Médio: R$" + saldoMedio);
        System.out.println("Valor do Crédito: R$" + valorCredito);
    }
}
