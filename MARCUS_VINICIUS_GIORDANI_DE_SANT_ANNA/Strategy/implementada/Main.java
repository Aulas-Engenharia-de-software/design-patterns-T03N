package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.Strategy.implementada;

public class Main {
    public static void main(String[] args) {
        Receita receita1 = new Receita(new ExibicaoIniciante());
        Receita receita2 = new Receita(new ExibicaoIntermediario());
        Receita receita3 = new Receita(new ExibicaoAvancado());

        receita1.exibir();
        receita2.exibir();
        receita3.exibir();
    }
}
