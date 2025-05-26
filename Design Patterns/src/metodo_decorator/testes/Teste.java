package metodo_decorator.testes;

import metodo_decorator.classes.Notificador;
import metodo_decorator.classes.NotificadorCelular;
import metodo_decorator.classes.NotificadorEmail;
import metodo_decorator.classes.NotificadorSimples;

public class Teste {

    public static void main(String[] args) {

        Notificador notificador = new NotificadorEmail(new NotificadorCelular(new NotificadorSimples()));

        notificador.notificar();

    }

}
