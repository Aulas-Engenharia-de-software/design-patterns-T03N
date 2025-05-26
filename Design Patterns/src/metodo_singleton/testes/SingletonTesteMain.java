package metodo_singleton.testes;

import metodo_singleton.classes.SingletonConexaoJdbc;

public class SingletonTesteMain {
    public static void main(String[] args) {

        System.out.println("Realizando conexão com o banco de dados!");

        SingletonConexaoJdbc singletonConexao = SingletonConexaoJdbc.getInstance("root", "root", "jdbc:mysql://localhost:3306/");

        System.out.println("Conectando com os dados\n"
                + "User: " + singletonConexao.user
                + "\n Password: " + singletonConexao.password
                + "\n URL: " + singletonConexao.url);

        System.out.println("Conexão perdida!");
        System.out.println("Tentando conectar novamente!");

        // Dados foram alterados para conexão porém o Design pattern deve impedir e seguir utilizando a mesma instância.
        SingletonConexaoJdbc singletonSegundaConexao = SingletonConexaoJdbc.getInstance("admin", "admin", "jdbc:mysql://localhost:3330/");

        System.out.println("Conectando com os dados\n"
                + "User: " + singletonSegundaConexao.user
                + "\nPassword: " + singletonSegundaConexao.password
                + "\nURL: " + singletonSegundaConexao.url);

    }
}