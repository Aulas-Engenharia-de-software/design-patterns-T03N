package metodo_singleton.classes;

public final class SingletonConexaoJdbc {

    private static SingletonConexaoJdbc instance;

    public String user;
    public String password;
    public String url;

    private SingletonConexaoJdbc(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public static SingletonConexaoJdbc getInstance(String user, String password, String url) {
        if  (instance == null) {
            instance = new SingletonConexaoJdbc(user, password, url);
        }
        return instance;
    }

}
