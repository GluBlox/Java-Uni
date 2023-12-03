import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GerenciarConta {
    public static void main(String[] args) {

        Conta conta = new Conta();

        while (true){
            String opcoes[] = {"CADASTRAR",
                    "DEPOSITAR",
                    "SACAR",
                    "EXIBIR DADOS",
                    "SAIR"};
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha sua opção",
                    "Escolha",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
            switch (opcao){
                case 0:
                    conta.cadastrar();
                    break;
                case 1:
                    try{
                        conta.depositar(Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                        "Digite o valor para depósito: ",
                                        "Entrada de dados",
                                        JOptionPane.QUESTION_MESSAGE)));
                        break;
                    }
                    catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Você não forneceu um valor decimal válido. Por favor, tente novamente.",
                                "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                case 2:
                    try {
                        conta.sacar(Double.parseDouble(
                                JOptionPane.showInputDialog("Digite o valor para saque: ")));
                        break;
                    }
                    catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Você não forneceu um valor decimal válido. Por favor, tente novamente.",
                                "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                case 3:
                    conta.exibirDados();
                    break;
                case 4:
                    int resposta = JOptionPane.showConfirmDialog(null,
                            "Deseja realmente sair?",
                            "SAIR",
                            JOptionPane.YES_NO_OPTION);
                    if (resposta==0) {
                        System.exit(0);
                    }
            }
        }

        /*
        do {
            String opcao[] = {"Cadastrar", "Depositar", "Sacar", "Exibir Dados", "Sair"};
            int selecao = JOptionPane.showOptionDialog(null,
                    "Seleciona a ação desejada",
                    "Seleção",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcao,
                    opcao[0]);

            switch (selecao) {
                case 0:
                    conta.cadastrar();
                    break;
                case 1:
                    conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Digite o valor para depósito: ",
                            "Entrada de dados",
                            JOptionPane.QUESTION_MESSAGE)));
                    break;
                case 2:
                    conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque: ")));
                    break;
                case 3:
                    conta.exibirDados();
                    break;
                case 4:
                    int resposta = JOptionPane.showConfirmDialog(null,
                            "Deseja realmente sair?",
                            "SAIR",
                            JOptionPane.YES_NO_OPTION);
                    if (resposta == 0) {
                        System.exit(0);
                    }
            }
        } while (true);
        */

        /*
        Conta conta = new Conta();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - CADASTRAR \n" +
                    "2 - DEPOSITAR \n" +
                    "3 - SACAR \n" +
                    "4 - EXIBIR DADOS \n" +
                    "0 - SAIR \n"));

            switch (opcao) {
                case 1:
                    conta.cadastrar();
                    break;
                case 2:
                    conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para depósito: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE)));
                    break;
                case 3:
                    conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque: ")));
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "SAIR", JOptionPane.YES_NO_OPTION);
                    if (resposta == 0) {
                        System.exit(0);
                    }
                    else {
                        opcao = 1;
                        continue;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido", "CUIDADO", JOptionPane.ERROR_MESSAGE);
                    continue;
            }
        } while (opcao != 0);
        */
    }
}