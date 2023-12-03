import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GerenciarAlunos {
    public static void main(String[] args) {

        //Instanciar o objeto aluno

        /*
        Alunos alunos = new alunos();
        alunos.ra = 12345;
        alunos.nome = "Rodrigo";
        alunos.endereco = "Rua 1";

        alunos.setEmail("rodrigo@");
        alunos.setTelefone("(19)99999-9999");

        System.out.println(alunos.nome);
        System.out.println(alunos.getEmail());
        System.out.println(alunos.getTelefone());
        */

        Acesso meuAcesso = new Acesso("admin", "admin");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        meuAcesso.setUsuario(sc.next());
        System.out.print("Digite sua senha: ");
        meuAcesso.setSenha(sc.next());
        boolean resposta = meuAcesso.validarSenha();
        if (resposta) {
            System.out.println("Usuário logado com sucesso");
            System.out.println("Seja bem vindo " + meuAcesso.getUsuario());
        }
        else {
            System.out.println("Senha inválida!");
        }
    }
}