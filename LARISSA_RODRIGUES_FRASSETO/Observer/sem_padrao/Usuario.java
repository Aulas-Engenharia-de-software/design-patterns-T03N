package LARISSA_RODRIGUES_FRASSETO.Observer.sem_padrao;

public class Usuario {
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    public void notificar(String musica){
        System.out.println(nome + " foi notificado: Nova musica lançada - "
        + musica);
    }
}
