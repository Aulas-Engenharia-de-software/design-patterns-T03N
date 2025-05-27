package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.FactoryMethod.versao_ingenua;

public class Receita {
    private String nome;

    public Receita(String nome) {
        this.nome = nome;
    }

    public void preparar() {
        System.out.println("Preparando: " + nome);
    }
}
