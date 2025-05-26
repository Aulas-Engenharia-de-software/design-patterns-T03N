package metodo_decorator_improvisado.classes;

public class NotificarEmail extends Notificar {

    public String email;

    public NotificarEmail(String user, String informacao, String email) {
        super(user, informacao);
        this.email = email;
    }

    @Override
    public void notificar () {
        System.out.println("Notificando o E-mail: "
                + this.email
                + ", do usuario: "
                + this.user
                + ", Com a informação: "
                + this.informacao);
    }

}
