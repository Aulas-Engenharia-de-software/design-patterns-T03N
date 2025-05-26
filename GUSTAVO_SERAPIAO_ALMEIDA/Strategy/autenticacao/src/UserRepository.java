import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Map<String, User> users = new HashMap<>();

    static {
        users.put("admin", new User("admin", "1234", "abc123token"));
        users.put("guest", new User("guest", "guest", "guest-token"));
    }

    public static User findByUsername(String username) {
        return users.get(username);
    }
}
