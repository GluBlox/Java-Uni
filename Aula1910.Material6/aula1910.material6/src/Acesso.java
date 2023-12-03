public class Acesso {

    //Atributos
    private String usuario;
    private String senha;

    //Constructor
    public Acesso(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    //getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Metódo que retorna um boolean e sem parâmetros
    protected boolean validarSenha() {

        boolean ok = false;
        if(this.senha.equalsIgnoreCase("cursoJava")) {
            ok = true;
        }
        return ok;
    }

}
