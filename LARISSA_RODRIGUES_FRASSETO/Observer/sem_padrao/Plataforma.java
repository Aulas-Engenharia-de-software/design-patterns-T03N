package LARISSA_RODRIGUES_FRASSETO.Observer.sem_padrao;
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void lancarMusica(String nomeMusica){
        System.out.println("Nova musica lançada: " + nomeMusica);
        for (Usuario u : usuarios){
            u.notificar(nomeMusica);
        }
    }
}
