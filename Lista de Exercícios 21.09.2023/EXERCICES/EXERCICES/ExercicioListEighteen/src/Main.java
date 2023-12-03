import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int codigoAluno;
        double nota1, nota2, nota3, mediaPonderada;

        System.out.println("Informe o código do aluno: ");
        codigoAluno = exe.nextInt();

        System.out.println("Informe a primeira nota: ");
        nota1 = exe.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = exe.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = exe.nextDouble();

        mediaPonderada = (nota1 * 3 + nota2 * 3 + nota3 * 4) / 10;

        System.out.println("Código do Aluno: " + codigoAluno);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 5.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }
}
