public class EmailStrategy implements AuthenticationStrategy{
    @Override
    public boolean authenticate(User user, String credential) {
        return user.getEmail().equalsIgnoreCase(credential);
    }
}
