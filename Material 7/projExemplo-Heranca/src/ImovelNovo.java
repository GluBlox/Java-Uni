import javax.swing.*;

public class ImovelNovo extends Imovel{

    //Atributo
    private double adicionalPreco;

    //Método de Acesso
    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    public void calcularAdicional() {
        this.adicionalPreco = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor adicional do imóvel"));
        this.setPreco(this.getPreco() + this.adicionalPreco);

        JOptionPane.showMessageDialog(null,
                "O preço do imóvel novo é: " + this.getPreco());
    }
}
