package LARISSA_RODRIGUES_FRASSETO.FactoryMethod.com_padrao;

public class UsuarioFactory {
    public static Usuario criarUsuario(TipoUsuario tipo){
        switch (tipo) {
            case ADMIN:
                return new Admin();
            case VISITANTE:
                return new Visitante();
            case MODERADOR:
                return new Moderador();
            default:
                throw new IllegalArgumentException("Tipo invalido.");
        }
    }
}
