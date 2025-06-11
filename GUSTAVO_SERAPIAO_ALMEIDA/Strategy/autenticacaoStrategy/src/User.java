public class User {
    private String username;
    private String password;
    private String token;
    private String email;

    public User(String username, String password, String token, String email) {
        this.username = username;
        this.password = password;
        this.token = token;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }
}
