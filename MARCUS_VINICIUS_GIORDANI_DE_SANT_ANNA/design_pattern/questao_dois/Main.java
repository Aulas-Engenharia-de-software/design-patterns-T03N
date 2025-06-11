package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_dois;

public class Main {
    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoSimples());
        System.out.println("Imposto Simples: R$ " + calculadora.calcular(1000));

        calculadora.setEstrategia(new ImpostoProgressivo());
        System.out.println("Imposto Progressivo: R$ " + calculadora.calcular(2000));

        calculadora.setEstrategia(new Isento());
        System.out.println("Isento: R$ " + calculadora.calcular(1000));
    }
}

