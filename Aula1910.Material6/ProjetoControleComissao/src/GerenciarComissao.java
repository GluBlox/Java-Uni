import javax.swing.*;

public class GerenciarComissao {
    public static void main(String[] args) {

        boolean continua=true;

        while(continua){

            Vendedor vendedor = new Vendedor();

            double valorVendido, total, comissao;

            try {
                vendedor.setNome(
                        JOptionPane.showInputDialog(
                                "Digite o nome do vendedor"));

                vendedor.setSalarioBase(
                        Double.parseDouble(
                                JOptionPane.showInputDialog(
                                        "Digite o salário base:")));

                valorVendido = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Digite o total vendido"));

                comissao = vendedor.calculoComissao(valorVendido);

                total = comissao + vendedor.getSalarioBase();

                JOptionPane.showMessageDialog(null,
                        "Nome do vendedor: " + vendedor.getNome()
                                + "\nSalário base: " + vendedor.getSalarioBase()
                                + "\nComissão: " + comissao
                                + "\nSalário total: " + total);

                int resposta = JOptionPane.showConfirmDialog(null,
                        "Deseja continuar?",
                        "Mensagem",
                        JOptionPane.YES_NO_OPTION);
                if (resposta == 0) {
                    continua = true;
                }
                else {
                    System.exit(0);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato inválido, tente novamente");
            }
        }
    }
}