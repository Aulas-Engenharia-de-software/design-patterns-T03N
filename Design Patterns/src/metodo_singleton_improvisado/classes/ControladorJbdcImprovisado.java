package metodo_singleton_improvisado.classes;

public class ControladorJbdcImprovisado {

    private ConexaoJbdcImprovisado conexaoConcluida;

    public ConexaoJbdcImprovisado conectar (String user, String password, String url) {

        if (conexaoConcluida == null) {
            conexaoConcluida = new ConexaoJbdcImprovisado(user, password, url);
        }

        return conexaoConcluida;
    }

}
