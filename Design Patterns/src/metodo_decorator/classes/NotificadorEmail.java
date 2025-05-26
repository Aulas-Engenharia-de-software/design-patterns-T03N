package metodo_decorator.classes;

public class NotificadorEmail implements Notificador {

    // Decorador
    private Notificador controleNotificador;

    public NotificadorEmail(Notificador outroNotificador) {
        this.controleNotificador = outroNotificador;
    }

    public void notificar() {
        controleNotificador.notificar();
        System.out.println("Enviando notificação por e-mail.");
    }
}
