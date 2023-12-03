import javax.swing.*;

public class Calculadora {

    //Atributos
    private double n1;
    private double n2;
    private double r;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void soma() {
        this.n1 = 0;
        this.n2 = 0;
        this.r = 0;

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

        r = n1 + n2;

        JOptionPane.showMessageDialog(
                null,
                "Resultado: " + r,
                "RESPOSTA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void subtrair(double a, double b) {
        double r;

        r = a - b;

        JOptionPane.showMessageDialog(
                null,
                "Resultado: " + r,
                "RESPOSTA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public double multiplicar() {
        this.n1 = 0;
        this.n2 = 0;
        this.r = 0;

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

        r = n1 * n2;

        return r;
    }

    public double dividir(double a, double b) {
        double r;

        r = a / b;

        return r;
    }
}
