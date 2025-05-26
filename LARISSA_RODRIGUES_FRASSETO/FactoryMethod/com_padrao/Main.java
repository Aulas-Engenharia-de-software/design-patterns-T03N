package LARISSA_RODRIGUES_FRASSETO.FactoryMethod.com_padrao;

public class Main {
    public static void main(String[] args){
        Usuario admin = UsuarioFactory.criarUsuario(TipoUsuario.ADMIN);
        Usuario visitante = UsuarioFactory.criarUsuario(TipoUsuario.VISITANTE);
        Usuario moderador = UsuarioFactory.criarUsuario(TipoUsuario.MODERADOR);

        System.out.println("PERMISSOES DOS USUARIOS:");
        System.out.println();
        admin.exibirPermissoes();
        visitante.exibirPermissoes();
        moderador.exibirPermissoes();
        System.out.println();
    }
}
