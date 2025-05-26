public class AuthenticatorContext {
    private AuthenticationStrategy strategy;

    // Injeta a estratégia desejada
    public AuthenticatorContext(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticate(String username, String credential) {
        User user = UserRepository.findByUsername(username);
        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return false;
        }
        return strategy.authenticate(user, credential);
    }
}
