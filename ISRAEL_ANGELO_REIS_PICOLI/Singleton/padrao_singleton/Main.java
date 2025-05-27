public class Main {
    public static void main(String[] args) {
        BancoDeDados conexao = BancoDeDados.getInstancia();

        conexao.conectar("roberto", "123123"); // Primeira conexão com o banco
        System.out.println(conexao.status()); // Mostra na tela como está o status da conexão

        conexao.executarComando("SELECT * FROM usuarios"); // Executa um comando enquanto está conectado
        System.out.println();
        conexao.conectar(); // Outra pessoa tenta fazer uma conexão com o banco quando já existe uma ativa

        conexao.desconectar(); // Desconecta a primeira pessoa do banco
        System.out.println(conexao.status()); // Mostra na tela o status da conexão

        conexao.executarComando("DELETE FROM usuarios"); // Tenta executar um comando estando desconectado
        System.out.println();
        conexao.conectar(); // A segunda pessoa tenta conectar novamente
    }
}