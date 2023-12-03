import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int totalPessoas = 50, totalMulheres = 0, sexo;

        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE, somaAlturaMulheres = 0, somaAlturaPopulacao = 0;
        double altura, mediaAlturaMulheres, mediaAlturaPopulacao, percentualHomens;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Informe a altura da pessoa #" + i + " (em metros): ");
            altura = exe.nextDouble();

            System.out.println("Informe o sexo da pessoa #" + i + " (0 para masculino, 1 para feminino): ");
            sexo = exe.nextInt();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            somaAlturaPopulacao += altura;

            if (sexo == 1) { // Feminino
                somaAlturaMulheres += altura;
                totalMulheres++;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
        mediaAlturaPopulacao = somaAlturaPopulacao / totalPessoas;
        percentualHomens = (totalPessoas - totalMulheres) * 100.0 / totalPessoas;

        System.out.println("a) Maior altura encontrada: " + maiorAltura + " metros");
        System.out.println("   Menor altura encontrada: " + menorAltura + " metros");
        System.out.println("b) Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("c) Média de altura da população: " + mediaAlturaPopulacao + " metros");
        System.out.println("d) Percentual de homens na população: " + percentualHomens + "%");
    }
}
