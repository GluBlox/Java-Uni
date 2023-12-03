//Minha classe de modelagem

public class Alunos {

    //Atributos
    public int ra;
    public String nome;
    protected String endereco;
    private String email;
    private String telefone;

    //Metódos de acesso
    //Getters e setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

