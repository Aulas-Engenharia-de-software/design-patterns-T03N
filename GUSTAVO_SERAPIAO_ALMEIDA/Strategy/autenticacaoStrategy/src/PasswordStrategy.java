public class PasswordStrategy implements AuthenticationStrategy{
    @Override
    public boolean authenticate(User user, String credential) {
        return user.getPassword().equals(credential);
    }
}

