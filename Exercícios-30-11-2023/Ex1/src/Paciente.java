import javax.swing.*;

public class Paciente {

    //Atributos
    private String nome;
    private int idade;
    private String dataConsulta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    //Métodos
    public void cadastrarPaciente() {
        try {
            this.nome = JOptionPane.showInputDialog("Insira o nome do paciente");
            this.idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do paciente"));
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

    public void adicionarConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void exibirConsulta() {
        JOptionPane.showMessageDialog(
                null,
                "Nome: " + this.nome +
                        "\nIdade: " + this.idade +
                        "\nData: " + this.dataConsulta,
                "CONSULTA",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
