import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner exe = new Scanner(System.in);

        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosNulos = 0;
        int votosBranco = 0;

        System.out.println("Informe o código do candidato (1, 2, 3 para nulo, 4 para branco, 0 para encerrar):");

        while (true) {
            int codigoVoto = exe.nextInt();

            if (codigoVoto == 0) {
                break;
            }

            totalVotos++;

            switch (codigoVoto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosNulos++;
                    break;
                case 4:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Código de voto inválido. Ignorando voto.");
            }
        }


        double percentualCandidato1 = (votosCandidato1 * 100.0) / totalVotos;
        double percentualCandidato2 = (votosCandidato2 * 100.0) / totalVotos;
        double percentualNulos = (votosNulos * 100.0) / totalVotos;
        double percentualBranco = (votosBranco * 100.0) / totalVotos;


        System.out.println("Percentual de votos para o Candidato 1: " + percentualCandidato1 + "%");
        System.out.println("Percentual de votos para o Candidato 2: " + percentualCandidato2 + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBranco + "%");

    }
}