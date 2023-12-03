public class Vendedor {

    //Atributos

    private String nome;

    private double salarioBase;

    //Métodos de Acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calculoComissao(double valorVendido) {
        double comissao;
        return comissao = valorVendido * 0.1;
    }
}
