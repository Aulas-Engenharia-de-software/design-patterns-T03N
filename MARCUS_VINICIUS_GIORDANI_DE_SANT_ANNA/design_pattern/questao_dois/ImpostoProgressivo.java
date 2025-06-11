package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_dois;

public class ImpostoProgressivo implements ImpostoStrategy {
    public double calcular(double valor) {
        if (valor <= 1000) {
            return valor * 0.05; // 5%
        } else {
            return valor * 0.15; // 15%
        }
    }
}
