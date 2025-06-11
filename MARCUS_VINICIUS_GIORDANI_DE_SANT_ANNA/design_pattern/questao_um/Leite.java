package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_um;

public class Leite extends DecoradorBebida {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.50;
    }
}
