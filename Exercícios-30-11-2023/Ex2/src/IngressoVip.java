public class IngressoVip extends Ingresso {

    //Atributos
    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    //Métodos
    public String imprimir() {
        return "Valor do ingresso: " + (valor + valorAdicional);
    }
}
