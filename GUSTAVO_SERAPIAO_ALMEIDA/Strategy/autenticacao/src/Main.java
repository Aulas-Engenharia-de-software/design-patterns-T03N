import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autenticador auth = new Autenticador();

        System.out.println("=== Sistema de Autenticação (sem Strategy) ===");
        System.out.print("Digite o tipo (senha / token): ");
        String tipo = sc.nextLine();

        System.out.print("Usuário: ");
        String user = sc.nextLine();

        System.out.print("Credencial: ");
        String cred = sc.nextLine();

        boolean ok = auth.authenticate(tipo, user, cred);
        System.out.println(ok ? "Autenticado com sucesso!" : "Falha na autenticação.");

        sc.close();
    }
}