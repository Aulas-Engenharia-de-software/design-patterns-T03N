package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.Strategy.implementada;

public class Receita {
    private ModoDeExibicao exibicao;

    public Receita(ModoDeExibicao exibicao) {
        this.exibicao = exibicao;
    }

    public void exibir() {
        exibicao.mostrarPassos();
    }
}
