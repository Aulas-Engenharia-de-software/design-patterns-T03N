public class BancoDeDados {
    private static final BancoDeDados instancia = new BancoDeDados();
    private boolean conectado;
    private String usuario;
    private String senha;

    private BancoDeDados() {
        conectado = false;
    }

    public static BancoDeDados getInstancia() {
        return instancia;
    }

    public void conectar(String usuario, String senha) {
        if (conectado == false) {
            this.usuario = usuario;
            this.senha = senha;
            System.out.println("Iniciando conexão ao banco: " + usuario + ".");
            conectado = true;
        } else {
            System.out.println("Conexão já existente ao banco como: " + this.usuario + ".");
        }
    }

    public void conectar() {
        conectar("luiz", "123123");
    }

    public void desconectar() {
        if (conectado) {
            System.out.println("Conexão com o banco encerrada.");
            conectado = false;
            usuario = null;
            senha = null;
        } else {
            System.out.println("Já desconectado do banco.");
        }
    }

    public boolean estaConectado() {
        return conectado;
    }

    public String status() {
        if (conectado) {
            return "Conectado como " + usuario;
        } else {
            return "Desconectado";
        }
    }

    public void executarComando(String sql) {
        if (conectado) {
            System.out.println("Comando executado: " + sql);
        } else {
            System.out.println("Falha na execução do comando, sem conexão com o banco.");
        }
    }
}