package LARISSA_RODRIGUES_FRASSETO.Observer.sem_padrao;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Usuario ana = new Usuario("Ana");
        Usuario joao = new Usuario("Joao");

        plataforma.adicionarUsuario(ana);
        plataforma.adicionarUsuario(joao);

        System.out.println("NOTIFICACAO DO LANCAMENTO:");
        System.out.println();

        plataforma.lancarMusica("Melodia");

        System.out.println();
    }
}
