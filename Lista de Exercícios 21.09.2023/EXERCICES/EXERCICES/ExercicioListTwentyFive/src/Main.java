import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salarioCarlos, salarioJoao, rendimentoCarlos, rendimentoJoao;
        int meses;

        salarioCarlos = 2000.0;
        salarioJoao = salarioCarlos / 3;

        rendimentoCarlos = 0.02;
        rendimentoJoao = 0.05;

        meses = 0;

        while (salarioJoao <= salarioCarlos) {
            salarioCarlos += salarioCarlos * rendimentoCarlos;
            salarioJoao += salarioJoao * rendimentoJoao;
            meses++;
        }

        System.out.println("Quantidade de meses necessários para que o valor de João ultrapasse ou iguale ao de Carlos: " + meses);
    }
}
