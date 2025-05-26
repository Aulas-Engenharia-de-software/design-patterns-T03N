package metodo_decorator_improvisado.classes;

public class Notificar {

    public String user;
    public String informacao;

    public Notificar(String user, String informacao) {
        this.user = user;
        this.informacao = informacao;
    }

    public void notificar () {
        System.out.println("Notificando o usuario: "
                    + this.user
                    + ",Com a informação: "
                    + this.informacao);
    }

}
