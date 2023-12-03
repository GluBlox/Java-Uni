import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = exe.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = exe.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = exe.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;


        if (media >= 7.0) {
            System.out.println("Média: " + media);
            System.out.println("Aprovado");
        } else if (media >= 4.0) {
            System.out.println("Média: " + media);
            System.out.println("Em prova final");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Reprovado");
        }

    }
}
