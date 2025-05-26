package LARISSA_RODRIGUES_FRASSETO.Observer.com_padrao;

public interface Subject {
    void registrarObservador(Observer o);
    void removerObservador(Observer o);
    void notificarObservadores(String musica);
}
