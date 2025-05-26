package LARISSA_RODRIGUES_FRASSETO.Observer.com_padrao;

public class Main {
    public static void main(String[] args){
        Plataforma plataforma = new Plataforma();

        Usuario ana = new Usuario("Ana");
        Usuario joao = new Usuario("Joao");

        plataforma.registrarObservador(ana);
        plataforma.registrarObservador(joao);

        System.out.println("NOTIFICACAO DO LANCAMENTO:");
        System.out.println();
        
        plataforma.lancarMusica("Tralala");

        System.out.println();
    }
}
