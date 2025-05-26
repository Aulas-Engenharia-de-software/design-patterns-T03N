package LARISSA_RODRIGUES_FRASSETO.Observer.com_padrao;

public class Usuario implements Observer{
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String musica){
        System.out.println(nome + " recebeu notificacao: Nova musica - "
        + musica);
    }
}
