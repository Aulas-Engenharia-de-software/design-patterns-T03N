package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_dois;

public class ImpostoSimples implements ImpostoStrategy {
    public double calcular(double valor) {
        return valor * 0.10; // 10%
    }
}
