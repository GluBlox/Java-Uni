import javax.swing.*;

public class GerenciarCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double n1 = 0;
        double n2 = 0;
        double r = 0;

        //Start
        boolean continuar = true;

        while(continuar) {
            String opcoes[] = {"SOMA",
                    "SUBTRAÇÃO",
                    "MULTIPLICAÇÃO",
                    "DIVISÃO",
                    "SAIR"
            };
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha sua opção",
                    "Escolha",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );
            switch(opcao) {
                case 0:
                    calculadora.soma();
                    break;

                case 1:
                    try {
                        n1 = Double.parseDouble(JOptionPane.showInputDialog(
                                null,
                                "Insira o primeiro valor")
                        );
                        n2 = Double.parseDouble(JOptionPane.showInputDialog(
                                null,
                                "Insira o segundo valor")
                        );
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Valores inválidos, tente novamente.",
                                "ERRO",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    calculadora.subtrair(n1, n2);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(
                            null,
                            "Resultado: " + calculadora.multiplicar(),
                            "RESPOSTA",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 3:
                    try {
                        n1 = Double.parseDouble(JOptionPane.showInputDialog(
                                null,
                                "Insira o primeiro valor")
                        );
                        n2 = Double.parseDouble(JOptionPane.showInputDialog(
                                null,
                                "Insira o segundo valor")
                        );
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Valores inválidos, tente novamente.",
                                "ERRO",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    JOptionPane.showMessageDialog(
                            null,
                            "Resultado: " + calculadora.dividir(n1, n2),
                            "RESPOSTA",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 4:
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