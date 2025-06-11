package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_um;

public class CafeSimples implements Bebida {
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }
}
