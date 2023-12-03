import javax.swing.*;

public class Conta {

    private String agencia;
    private String numConta;
    private Double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente: ");
        }
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null,
                "Agência: " + this.agencia +
                "\nNúmero da Conta: " + this.numConta +
                "\nSaldo: " + this.saldo);
    }

    public void cadastrar(){
        boolean verifica = true;
        this.saldo = 0.0;
        while (verifica){
            this.agencia = JOptionPane.showInputDialog("Digite o número da agência: ");
            this.numConta = JOptionPane.showInputDialog("Digite o número da conta: ");
            if (this.agencia.isEmpty() || this.numConta.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Campos obrigatórios");
            }
            else{
                verifica = false;
            }
        }
    }
}
