package itens_leigo;

public class Cliente {
    private String nome;
    private String nivel; // Pode ser Clube ou Padrão

    public Cliente(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }
}