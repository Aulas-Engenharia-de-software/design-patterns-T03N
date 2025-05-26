package LARISSA_RODRIGUES_FRASSETO.Observer.com_padrao;
import java.util.ArrayList;
import java.util.List;

public class Plataforma implements Subject{
    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String musica) {
        for (Observer o : observadores) {
            o.atualizar(musica);
        }
    }

    public void lancarMusica(String nomeMusica) {
        System.out.println("Lancamento: " + nomeMusica);
        notificarObservadores(nomeMusica);
    }
}
