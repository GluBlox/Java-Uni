public class GerenciarImovel {
    public static void main(String[] args) {

        Imovel imovel = new Imovel();
        ImovelNovo imovelNovo = new ImovelNovo();

        imovel.cadastrarImovel();
        imovel.listarImovel();
        imovelNovo.calcularAdicional();
    }
}