public class Autenticador {

    public boolean authenticate(String tipo, String username, String credential) {
        User user = UserRepository.findByUsername(username);
        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return false;
        }

        if ("senha".equalsIgnoreCase(tipo)) {
            return user.getPassword().equals(credential);
        } else if ("token".equalsIgnoreCase(tipo)) {
            return user.getToken().equals(credential);
        } else {
            System.out.println("Tipo de autenticação desconhecido.");
            return false;
        }
    }
}
