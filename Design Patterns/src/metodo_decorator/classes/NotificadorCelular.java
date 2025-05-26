package metodo_decorator.classes;

public class NotificadorCelular implements Notificador {

    // Decorador
    private Notificador controleNotificador;

    public NotificadorCelular(Notificador outroNotificador) {
        this.controleNotificador = outroNotificador;
    }

    public void notificar() {
        controleNotificador.notificar();
        System.out.println("Enviando notificação por celular.");
    }

}
