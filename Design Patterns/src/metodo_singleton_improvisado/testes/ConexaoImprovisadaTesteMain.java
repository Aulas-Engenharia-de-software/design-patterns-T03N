package metodo_singleton_improvisado.testes;

import metodo_singleton_improvisado.classes.ConexaoJbdcImprovisado;
import metodo_singleton_improvisado.classes.ControladorJbdcImprovisado;

public class ConexaoImprovisadaTesteMain {

    public static void main(String[] args) {

        ControladorJbdcImprovisado gerenciadorConexao = new ControladorJbdcImprovisado();;

        ConexaoJbdcImprovisado primeiraConexao = gerenciadorConexao.conectar("root", "root", "jdbc:mysql://localhost:3306/");

        System.out.println("Conectando com os dados\n"
                + "User: " + primeiraConexao.user
                + "\nPassword: " + primeiraConexao.password
                + "\nURL: " + primeiraConexao.url);

        System.out.println("Conexão perdida!");
        System.out.println("Tentando conectar novamente!");

        // Dados foram alterados para conexão porém o gerenciador deve impedir e seguir utilizando a mesma instância.

        ConexaoJbdcImprovisado segundaConexao = gerenciadorConexao.conectar("admin", "admin", "jdbc:mysql://localhost:3330/");

        System.out.println("Conectando com os dados\n"
                + "User: " + segundaConexao.user
                + "\nPassword: " + segundaConexao.password
                + "\nURL: " + segundaConexao.url);
    }
}
