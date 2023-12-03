import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int totalPessoas = 0,somaIdades = 0, opiniaoOtimo = 0, opiniaoBom = 0, opiniaoRegular = 0, opiniaoRuim = 0;
        int idade = 0, opiniao;
        double mediaIdades;


        while (true) {
            System.out.print("Informe a idade (ou valor negativo para encerrar): ");
            idade = exe.nextInt();

            if (idade < 0) {
                break;
            }

            totalPessoas++;
            somaIdades += idade;

            System.out.print("Informe a opinião (OP - 1=Ótimo, 2=Bom, 3=Regular, 4=Ruim): ");
            opiniao = exe.nextInt();

            switch (opiniao) {
                case 1:
                    opiniaoOtimo++;
                    break;
                case 2:
                    opiniaoBom++;
                    break;
                case 3:
                    opiniaoRegular++;
                    break;
                case 4:
                    opiniaoRuim++;
                    break;
                default:
                    System.out.println("Opinião inválida. Ignorando resposta.");
            }
        }

        mediaIdades = (double) somaIdades / totalPessoas;

        System.out.println("a) Total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.println("b) Média de idade das pessoas que responderam à pesquisa: " + mediaIdades);
        System.out.println("c) Porcentagem de cada opinião:");
        System.out.println("   Ótimo: " + (opiniaoOtimo * 100.0 / totalPessoas) + "%");
        System.out.println("   Bom: " + (opiniaoBom * 100.0 / totalPessoas) + "%");
        System.out.println("   Regular: " + (opiniaoRegular * 100.0 / totalPessoas) + "%");
        System.out.println("   Ruim: " + (opiniaoRuim * 100.0 / totalPessoas) + "%");
    }
}
