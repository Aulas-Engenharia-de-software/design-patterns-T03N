public interface AuthenticationStrategy {
    boolean authenticate(User user, String credential);
}
