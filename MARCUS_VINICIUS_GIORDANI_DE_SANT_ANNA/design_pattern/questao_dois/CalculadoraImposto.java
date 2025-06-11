package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_dois;

public class CalculadoraImposto {
    private ImpostoStrategy estrategia;

    public CalculadoraImposto(ImpostoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(ImpostoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double valor) {
        return estrategia.calcular(valor);
    }
}
