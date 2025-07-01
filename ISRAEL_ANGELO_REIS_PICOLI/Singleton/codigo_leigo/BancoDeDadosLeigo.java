public class BancoDeDadosLeigo {
    private boolean conectado;
    private String usuario;
    private String senha;

    public BancoDeDadosLeigo() {
        conectado = false;
    }

    public void conectar(String usuario, String senha) {
        if (!conectado) {
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
            System.out.println("Conexão com o banco encerrada: " + usuario + ".");
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