package metodo_decorator_improvisado.classes;

public class NotificarCelular extends Notificar {

    public String celular;

    public NotificarCelular(String user, String informacao, String celular) {
        super(user, informacao);
        this.celular = celular;
    }

    @Override
    public void notificar () {
        System.out.println("Notificando o numero: "
                + this.celular
                + ", do usuario: "
                + this.user
                + ", Com a informação: "
                + this.informacao);
    }

}
