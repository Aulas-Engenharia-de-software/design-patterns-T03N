package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_um;

public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;   
    }
}
