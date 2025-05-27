public class Main {
    public static void main(String[] args) {
        BancoDeDadosLeigo conexao1 = new BancoDeDadosLeigo();
        BancoDeDadosLeigo conexao2 = new BancoDeDadosLeigo();

        conexao1.conectar("roberto", "123123"); // Primeira conexão com o banco
        System.out.println(conexao1.status()); // Mostra na tela como está o status da conexão

        conexao1.executarComando("SELECT * FROM usuarios"); // Executa um comando enquanto está conectado
        System.out.println();

        conexao2.conectar(); // Outra pessoa tenta fazer uma conexão com o banco quando já existe uma ativa
        System.out.println(conexao2.status()); // Mostra na tela como está o status da conexão

        conexao2.executarComando("SELECT * FROM usuarios"); // Executa um comando ambos estão conectados
        System.out.println();

        conexao1.desconectar(); // Desconecta a primeira pessoa do banco
        System.out.println();

        conexao2.desconectar(); // Desconecta a segunda pessoa do banco
    }
}