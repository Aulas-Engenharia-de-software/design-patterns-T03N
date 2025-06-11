package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_um;

public class Chantilly extends DecoradorBebida {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + chantilly";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.00;
    }
}
