import javax.swing.*;

public class GerenciarPaciente {
    public static void main(String[] args) {

        String dataConsulta = "A";

        Paciente paciente = new Paciente();

        boolean continuar = true;

        while(continuar) {
            String opcoes[] = {"CADASTRAR PACIENTE",
                    "AGENDAR CONSULTA",
                    "MOSTRAR DADOS DA CONSULTA",
                    "SAIR"
            };
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha sua opção",
                    "ESCOLHA",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );
            switch(opcao) {
                case 0:
                    paciente.cadastrarPaciente();
                    break;

                case 1:
                    dataConsulta = JOptionPane.showInputDialog("Insira a data da consulta");
                    if (dataConsulta.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Valores inválidos, tente novamente.",
                                "ERRO",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    else paciente.adicionarConsulta(dataConsulta);
                    break;

                case 2:
                    paciente.exibirConsulta();
                    break;

                case 3:
                    int resposta = JOptionPane.showConfirmDialog(null,
                            "Deseja realmente sair?",
                            "SAIR",
                            JOptionPane.YES_NO_OPTION);
                    if (resposta==0) {
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}