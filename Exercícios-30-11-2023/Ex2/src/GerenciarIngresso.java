import javax.swing.*;

public class GerenciarIngresso {
    public static void main(String[] args) {
        double valor = 0;
        double valorAdicional = 0;

        Ingresso ingresso = new Ingresso();
        IngressoVip ingressoVip = new IngressoVip();

        boolean continuar = true;

        while(continuar) {
            String opcoes[] = {"INGRESSO",
                    "INGRESSO VIP",
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
                    ingresso.valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do ingresso"));
                    JOptionPane.showMessageDialog(
                            null,
                            ingresso.imprimir(),
                            "INGRESSO",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 1:
                    ingressoVip.valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do ingresso"));
                    ingressoVip.getValorAdicional() = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor adicional"));
                    JOptionPane.showMessageDialog(
                            null,
                            ingressoVip.imprimir(),
                            "INGRESSO VIP",
                            JOptionPane.INFORMATION_MESSAGE
                    );
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