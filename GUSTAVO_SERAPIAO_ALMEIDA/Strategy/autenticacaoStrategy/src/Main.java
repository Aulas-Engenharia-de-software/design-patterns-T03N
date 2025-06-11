import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Autenticação (com Strategy) ===");
        System.out.print("Digite o tipo (senha / token / email): ");
        String tipo = sc.nextLine();

        AuthenticationStrategy strat;
        if ("senha".equalsIgnoreCase(tipo)) {
            strat = new PasswordStrategy();
        } else if ("token".equalsIgnoreCase(tipo)) {
            strat = new TokenStrategy();
        } else if ("email".equalsIgnoreCase(tipo)){
            strat = new EmailStrategy();
        }else {
            System.out.println("Tipo desconhecido, usando senha por padrão.");
            strat = new PasswordStrategy();
        }

        AuthenticatorContext authCtx = new AuthenticatorContext(strat);

        System.out.print("Usuário: ");
        String user = sc.nextLine();

        System.out.print("Credencial: ");
        String cred = sc.nextLine();

        boolean ok = authCtx.authenticate(user, cred);
        System.out.println(ok ? "Autenticado com sucesso!" : "Falha na autenticação.");

        sc.close();
    }
}
