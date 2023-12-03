import javax.swing.*;
import java.awt.*;

public class Percurso {

    //Atributos
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;

    //Métodos
    public void cadastrarPercurso() {
        try {
            kmPercorrida = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Insira a quantidade de Km percorrida")
            );
            valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Insira o custo do combústivel")
            );
            valorPedagio = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Insira o custo de pedágio")
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
    }

    public void listarPercurso() {

    }
}
