package metodo_decorator_improvisado.testes;

import metodo_decorator_improvisado.classes.Notificar;
import metodo_decorator_improvisado.classes.NotificarCelular;
import metodo_decorator_improvisado.classes.NotificarEmail;
import metodo_decorator_improvisado.classes.NotificarFacebook;

public class Teste {

    public static void main(String[] args) {

        Notificar notificador1 = new NotificarCelular("Maylo", "Você está devendo", "45998029132");

        notificador1.notificar();

        Notificar notificador2 = new NotificarFacebook("Maylo", "Você está devendo", "Maylo Santos");

        notificador2.notificar();

        Notificar notificador3 = new NotificarEmail("Maylo", "Vocẽ está devendo", "msduarte@minha.fag.edu.br");

        notificador3.notificar();
    }

}
