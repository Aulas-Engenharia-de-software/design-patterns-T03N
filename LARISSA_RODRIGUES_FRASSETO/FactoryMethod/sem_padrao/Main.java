package LARISSA_RODRIGUES_FRASSETO.FactoryMethod.sem_padrao;

public class Main {
    public static void main(String[] args) {
        Usuario admin = new Admin();
        Usuario visitante = new Visitante();
        Usuario moderador = new Moderador();

        System.out.println("PERMISSOES DOS USUARIOS:");
        System.out.println();

        admin.exibirPermissoes();
        visitante.exibirPermissoes();
        moderador.exibirPermissoes();
        
        System.out.println();
    }
}
