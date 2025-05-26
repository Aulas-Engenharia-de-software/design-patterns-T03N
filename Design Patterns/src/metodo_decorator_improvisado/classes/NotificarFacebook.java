package metodo_decorator_improvisado.classes;

public class NotificarFacebook extends Notificar {

    public String facebook;

    public NotificarFacebook(String user, String informacao, String facebook) {
        super(user, informacao);
        this.facebook = facebook;
    }

    @Override
    public void notificar () {
        System.out.println("Notificando o Facebook: "
                + this.facebook
                + ", do usuario: "
                + this.user
                + ", Com a informação: "
                + this.informacao);
    }

}
