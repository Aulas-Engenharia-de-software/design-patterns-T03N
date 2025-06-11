public class TokenStrategy implements AuthenticationStrategy {
    @Override
    public boolean authenticate(User user, String credential) {
        return user.getToken().equals(credential);
    }
}
