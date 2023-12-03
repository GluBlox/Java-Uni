import javax.swing.*;

public class Imovel {

    //Atributos
    private int codigo;
    private String endereco;
    private double preco;

    //Métodos de Acesso
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrarImovel() {
        this.codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o código do imóvel"));
        this.endereco = JOptionPane.showInputDialog("Digite o endereço do imóvel");
        this.preco = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o preço do imóvel"));
    }

    public void listarImovel() {
        JOptionPane.showMessageDialog(null,
                "Código do imóvel: " + this.codigo +
                "\nEndereço: " + this.endereco +
                "\nPreço: " + this.preco);
    }
}
